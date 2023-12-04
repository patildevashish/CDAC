function submitForm(event) {
    event.preventDefault();
    var name = document.getElementById('name').value;
    var age = document.getElementById('age').value;
    var email = document.getElementById('email').value;
    var mobile = document.getElementById('mobile').value;
    var gender = document.getElementById('gender').value;
    var address = document.getElementById('address').value;
    var qualification = document.getElementById('qualification').value;

    
    var user = {
        name: name,
        age: age,
        email: email,
        mobile: mobile,
        gender: gender,
        address: address,
        qualification: qualification
    };

    
    var users = JSON.parse(localStorage.getItem('users')) || [];

    
    users.push(user);

    
    localStorage.setItem('users', JSON.stringify(users));

    
    document.getElementById('registrationForm').reset();

    alert('Registration successful!');
}