EX\_05FEB - Unique email addresses

Clean up a list of email addresses to send invitations to an event. The processing rules are as follows:

* Local part (before the @):

&nbsp;- Dots (.) - are ignored. a.b@gmail.com is the same as ab@gmail.com

&nbsp;- Plus sign (+) - everything after the first + (including the plus sign) is ignored. user+test@gmail.com is the same as user@gmail.com

* Domain name (after the @):

&nbsp;- Remains unchanged. Dots and plus signs have no special meaning here.

Requirement: Given a list of strings (emails), return the number of unique addresses that will actually receive the message.

