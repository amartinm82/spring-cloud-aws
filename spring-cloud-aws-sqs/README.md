# Spring Cloud AWS with Amazon SQS Example

This source read from two different queues using SQS bounced and complaint mails. 
Previously Amazon SES was configured to send bounce and complaint notifications to a topic of Amazon SNS though Amazon SES Console. The queues are feed from that topics, so the queues content is a Notification Message which contains Bounced or Complaint Notification.
