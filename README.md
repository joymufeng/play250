### play-scala 2.5.0 doesn't works well on Heroku Platform

After deploying play-scala 2.5.0 applications to Heroku, it seems that play-scala 2.5.0 limit the response length to 85KB.
If the response is greater than 85KB, the left is ignored. This cause Chrome browser occurs the following errors:
```
http://play250.herokuapp.com/getResponse?len=99000 net::ERR_CONTENT_LENGTH_MISMATCH
```
