
###Sample request:
<pre>
curl --header "Content-Type: application/json" \
  --request POST \
  --data '{"deliveryManagerName":"xyz","moduleName":"M1", "pageName": "settings", "description":"technical issue when loading"}' \
  http://localhost:8080/email
</pre>
###References:
- https://www.baeldung.com/spring-email