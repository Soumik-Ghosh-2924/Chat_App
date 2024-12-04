---

## 🌟 Real-Time Chat Application

Welcome to the **Real-Time Chat Application**! This project is a fully functional chat application that enables users to communicate in real time.
Built using modern web technologies and Spring Boot, it mimics the seamless user experience of contemporary messaging platforms.

---

### 📝 Features

- **Real-Time Messaging**: Enables instant communication using WebSockets and STOMP.
- **Modern UI/UX**: A clean, responsive, and user-friendly interface.
- **Dynamic Background**: Vibrant and visually engaging design.
- **Lightweight Backend**: Powered by Spring Boot for efficient message handling.
- **Cross-Browser Compatible**: Works flawlessly across different browsers.

---

### 🚀 Tech Stack

| **Technology**         | **Description**                                    |
|-------------------------|----------------------------------------------------|
| HTML/CSS + Bootstrap    | Frontend interface with responsive design elements |
| JavaScript (STOMP.js)   | WebSocket connection and real-time messaging       |
| Spring Boot             | Backend framework for WebSocket handling          |
| SockJS                 | Fallback for WebSocket communication               |
| Jackson                 | JSON serialization/deserialization                |
| Maven                   | Dependency management                             |

---

### 📁 Folder Structure

```plaintext
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com.chat.App
│   │   │   │   ├── controller
│   │   │   │   │   └── ChatController.java
│   │   │   │   ├── configuration
│   │   │   │   │   └── WebSocketConfig.java
│   │   │   │   ├── model
│   │   │   │   │   └── ChatMessage.java
│   │   │   │   └── App.java
│   │   ├── resources
│   │   │   ├── static
│   │   │   │   └── chat.html
│   │   │   └── application.properties
├── pom.xml
└── README.md
```

---

### ⚙️ APIs

| **Endpoint**       | **Method** | **Description**                                    |
|---------------------|------------|----------------------------------------------------|
| `/app/sendMessage`  | `POST`     | Endpoint to handle client messages                |
| `/topic/messages`   | `SUBSCRIBE`| Subscription endpoint for broadcasting messages    |
| `/chat`             | `GET`      | Returns the `chat.html` file for the front-end    |

---

### 🎨 Screenshots

#### 1. Chat Interface
![Chat Interface]()

---

### 🛠️ Setup Instructions

Follow these steps to get the project up and running on your local machine.

#### Prerequisites:
- Java 17 or higher
- Maven
- IDE (e.g., IntelliJ, Eclipse)
- Modern browser (e.g., Chrome, Edge, Firefox)

#### Steps:
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/chat-application.git
   cd chat-application
   ```

2. **Install Dependencies**:
   Ensure all Maven dependencies are resolved:
   ```bash
   mvn clean install
   ```

3. **Run the Application**:
   Start the Spring Boot server:
   ```bash
   mvn spring-boot:run
   ```

4. **Access the Application**:
   Open your browser and navigate to:
   ```
   http://localhost:8080/chat
   ```

---

### 📜 How It Works

1. **WebSocket Initialization**: 
   - Clients connect to `/chat` using SockJS and STOMP.
   - Backend initializes the WebSocket connection and subscribes clients to `/topic/messages`.

2. **Message Flow**:
   - Users send messages via `/app/sendMessage`.
   - Backend broadcasts messages to `/topic/messages`.

3. **Frontend Rendering**:
   - Messages are displayed dynamically in the chat interface using JavaScript.

---

### 🤝 Contributing

Contributions are welcome! Please fork the repository and submit a pull request with your enhancements.

---

### 📧 Contact

For any questions or feedback, feel free to contact me:

- **Email**: [soumikghoshcodes@gmail.com](mailto:soumikghoshcodes@gmail.com)
- **GitHub**: [Your GitHub Profile](https://github.com/your-username)

---

### 🎉 Acknowledgments

Special thanks to:
- **Bootstrap** for their excellent UI framework.
- **Spring Boot Community** for robust backend support.

---
