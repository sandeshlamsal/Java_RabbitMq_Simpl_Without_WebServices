# Java_RabbitMq_Simpl_Without_WebServices

//SIMPLE Rabbit mq, send Receive msg from app, no web or rest end point...

1. Setup Rabbit Mq

2. Start the MQ service and access
the page to see the dash board

http://localhost:15672/

default user: guest
password : guest

3. Create a spring boot application

 Create two profiles
 
 Edit config, provide Main class location in IDE
 
 a. Sender : its own Main function
 b. Received : its own Main function


 4. Run the sender to see the queue has been created

 5. Run the receiver to get the queue , which clears the message form queue too.

