# PetMate: A Pet Adoption Platform

Welcome to **PetMate**, a full-stack web application designed to simplify the pet adoption process. PetMate connects shelters, adopters, and volunteers, providing a platform where users can find, adopt, and support pets in need. This project showcases my expertise in full-stack development, using technologies and best practices for scalable web applications.

---

## Table of Contents

1. [Project Overview](#project-overview)
2. [Features](#features)
3. [Technologies Used](#technologies-used)
4. [Project Structure](#project-structure)
5. [Setup Instructions](#setup-instructions)
6. [Usage](#usage)
7. [Contributing](#contributing)
   
---

## Project Overview
PetMate aims to streamline the pet adoption process by providing a centralized platform where adopters can browse available pets, shelters can manage their pet listings, and volunteers can assist with events and shelter activities.

**Key Objectives:**
- Enhance accessibility to pet adoption services.
- Automate and manage shelter, adoption, and volunteer records efficiently.
- Provide intuitive dashboards for users.

---

## Description
PetMate is a comprehensive solution designed to make pet adoption easier and more transparent. The platform bridges the gap between animal shelters and potential adopters, ensuring that pets find loving homes. The system includes detailed pet profiles, application management for shelters, and robust user management features. Volunteers can also register and participate in various shelter activities. Built with Java and Spring Boot on the backend and a responsive Bootstrap-based frontend, PetMate emphasizes user-friendly interfaces and efficient operations.

---

## Features
- **User Registration and Authentication**: Secure user registration, login, and role-based access.
- **Adoption Management**: Search and apply for pet adoption.
- **Shelter Management**: Manage pets, review applications, and generate reports.
- **Volunteer Management**: Track volunteer availability and profiles.
- **Reviews and Ratings**: Add reviews for adoption experiences.

---

## Technologies Used
- **Backend**: Java, Spring Boot
- **Frontend**: HTML, CSS, Bootstrap
- **Database**: MySQL
- **Tools**: Maven, Git, Eclipse/IntelliJ

---

## Project Structure

```
source/
|-- adopt/
|   |-- animal/
|   |   |-- pet/
|   |   |   |-- Pet.class
|   |   |   |-- PetDAO.class
|   |   |   |-- PetUtils.class
|   |-- breed/
|   |   |-- Breed.class
|   |   |-- BreedDAO.class
|   |   |-- BreedUtils.class
|   |-- reviewable/
|   |   |-- Review.class
|   |   |-- ReviewDAO.class
|   |   |-- ReviewUtils.class
|   |-- shelter/
|   |   |-- Shelter.class
|   |   |-- ShelterDAO.class
|   |   |-- ShelterUtils.class
|   |-- user/
|   |   |-- User.class
|   |   |-- UserDAO.class
|   |   |-- UserUtils.class
```

---

## Setup Instructions
1. Clone this repository:
   ```bash
   git clone https://github.com/yourusername/petmate.git
   ```
2. Import the project into your preferred IDE.
3. Set up the database:
   - Create a MySQL database named `petmate_db`.
   - Run the provided `schema.sql` file to initialize tables.
4. Configure application properties:
   - Update `application.properties` with your database credentials.
5. Run the application:
   ```bash
   mvn spring-boot:run
   ```

---

## Usage
- **Access the application**: Navigate to `http://localhost:8080`.
- **Register**: Create a user account.
- **Explore Pets**: View available pets and submit an adoption application.
- **Admin Access**: Manage shelters, volunteers, and pet listings.

---

## Contributing
Contributions are welcome! Please fork this repository and create a pull request.

---

Thank you for exploring PetMate! Feel free to connect for any suggestions or feedback.

