# Spring Application Context task

This application is based on two abstraction `StringConsumerService`, and `SpringConsumer`. The `StringConsumerService`
 has a method consume that receives a String parameter, and use `SpringConsumer` to apply some operation of this string.
 
 Your job is to **configure application context**, so the `StringConsumerService#comnume()` will print a spring in upper case
  with a space after each letter. See details in the 'todo' code comments. An entry point is a main class `AppContextTaskConfig`
 
