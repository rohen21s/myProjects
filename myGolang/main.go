/*
 * Simple program to understand Go Routines, deadlock and channels
 */

package main
import (
  "fmt"
)
func hello(done chan bool) {
   fmt.Println("Hello world goroutine")
   done <- true
}
func receive(receive bool, anotherDone chan bool) {
  if receive == true {
    fmt.Println("from receive")
    anotherDone <- true
  }
}
func main() {
  done := make(chan bool)
  anotherDone := make(chan bool)
  go hello(done)
  toSend := <-done
  go receive(toSend, anotherDone)
  <-anotherDone
  fmt.Println("main function")
}