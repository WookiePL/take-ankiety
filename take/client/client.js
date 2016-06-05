
function initWithData(url, callback) {
  var xmlhttp = new XMLHttpRequest();
  xmlhttp.onreadystatechange = function() {
      if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
          var data = xmlhttp.responseText;
          callback(data);
      }
  };
  xmlhttp.open("GET", url, true);
  xmlhttp.send();
}

function wykladowcyInit() {
  $.get("http://localhost:8080/take/ankiety/getPrzedmiot", function(data, status) {
    console.log(data);
  });
  console.log("dzialam");
}
