function validateInput() {
  number = document.getElementById("input-value").value;
  if (number < 0 || number > 100 || number % 1 != 0) {
    document.getElementById("input-value").alert();
  } else {
    showInput();
  }
}
function showInput(){
  document.getElementById("input-text").innerHTML = document.getElementById("input-value").value;
}