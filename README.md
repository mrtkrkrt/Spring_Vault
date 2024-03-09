## Spring Boot and Vault Integration
This project demonstrates the integration of Spring Boot with HashiCorp Vault to securely manage sensitive information within your application. HashiCorp Vault is an open-source tool designed for secure storage and management of secrets, such as passwords, API keys, access tokens, and other sensitive data.

What is Vault?
HashiCorp Vault is an open-source tool that facilitates the secure storage and management of confidential information. It ensures protection against malicious use of sensitive data, offering a secure solution for storing and managing secrets like passwords, API keys, and access tokens. Vault enhances the security of your applications by providing secure storage and management solutions.

About the Project
This project is built by combining Spring Boot and Vault, with the primary goal of enhancing the security of your application and ensuring the secure storage of sensitive information.

Project Features
* Spring Boot application
* Integration with HashiCorp Vault
* Secure information storage and retrieval


## How to Use
Install and Start Vault:

Download Vault from the official website and install it on your machine.
Start Vault by running the following command in your terminal or command prompt: vault server -dev
Configure Vault Address and Token:

Configure the Vault address and access token in the application.yml file.
```
spring:
  cloud:
    vault:
      uri: http://localhost:8200
      token: your-access-token
```
Run the Application:

Start the application by running the following command in your terminal or command prompt: ./mvnw spring-boot:run
Securely Access Sensitive Information:

Interact with Vault within your Spring Boot application to securely access sensitive information.
Contribution
If you would like to contribute to this project, feel free to provide suggestions or submit pull requests. We welcome any contributions to the project.

## License
This project is licensed under the MIT License. For detailed information, please refer to the license file.
