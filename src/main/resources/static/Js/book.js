function myFunction() {
  alert("Please, sign up or sign in before booking your tour!");
}



// disable old date
var date = new Date();    //display todays date(mm-dd-yy)
var tdate = date.getDate();   //show todays date only (8)
var month = date.getMonth() + 1;  //(getMonth() method returns value between 0 and 11) return last month (6) if add one(6+1) then return current month
if (tdate < 10) {
  tdate = "0" + tdate; //(08)
}
if (month < 10) {
  month = "0" + month; //(06)
}
var year = date.getUTCFullYear();  //returns current yr
var minDate = year + "-" + month + "-" + tdate;
document.getElementById("disable").setAttribute('min', minDate)
console.log(minDate); //2023-07-08



//To display successmessage after submiting Booking Form
document.getElementById("book-form").addEventListener("submit", function(e) {
  e.preventDefault();

  var whereto = document.getElementById("whereto").value;
  var numberofguests = document.getElementById("numberofguests").value;
  var arrivedate = document.getElementById("disable").value;
  var leavedate = document.getElementById("leavedate").value;
  var details = document.getElementById("details").value;
  

  // Create the form data
  var formData = new FormData();
  formData.append("whereto", whereto);
  formData.append("numberofguests", numberofguests);
  formData.append("arrivedate", arrivedate);
  formData.append("leavedate", leavedate);
  formData.append("details", details);

  // Send the form data asynchronously (data is sent to the server using fetch api)
  fetch("/book", {
    method: "POST",
    body: formData
  })
  .then(function(response) {
    if (response.ok) {

      // Display success message
      var successMessage = document.createElement("p");
      successMessage.textContent = "Booking successfull!";
      successMessage.style.color = "Red";
      document.getElementById("book-form").appendChild(successMessage);

      // Reset the form
      document.getElementById("book-form").reset();

      // Remove the success message after 1 seconds
      setTimeout(function() {
        successMessage.remove();
        window.location.href = "/";  //go to home page
      }, 1000);
    } else {
      throw new Error("Error submitting the form.");
    }
  })
  .catch(function(error) {
    console.error(error);
    // Display an error message if there was an issue submitting the form
    alert("There was an error submitting the form. Please try again.");
  });
});