📖 Blog Reader App
A simple blog reading application built with Jetpack Compose, MVVM architecture, Retrofit, and WebView.

🚀 Features
📰 Fetch Blogs – Retrieves latest blog posts using WordPress REST API.
🏗️ Modern UI – Built with Jetpack Compose for a seamless UI experience.
🔄 MVVM Architecture – Ensures clean code and separation of concerns.
📡 API Integration – Uses Retrofit to fetch blogs from the API.
🌐 WebView Integration – Opens full blog articles inside the app.
📌 Navigation Component – Handles screen navigation smoothly.

🛠 Tech Stack
Technology      	     Description
Kotlin	               Programming language
Jetpack Compose      	 Modern UI toolkit
MVVM Architecture    	 Clean code structure
Retrofit	             REST API calls
StateFlow	             Reactive state management
Navigation Component	 Handles navigation
WebView	               Displays full blog articles


📡 API Integration
This app fetches blogs from:
🔗 WordPress REST API

Sample API Response
json
Copy
Edit
[
    {
        "id": 123,
        "title": { "rendered": "My First Blog" },
        "link": "https://blog.vrid.in/sample-blog"
    }
]

📂 Project Structure
kotlin
Copy
Edit
📂 BlogReaderApp
 ├── 📂 data
 │   ├── Blog.kt
 │   ├── ApiService.kt
 │   ├── BlogRepository.kt
 ├── 📂 ui
 │   ├── BlogListScreen.kt
 │   ├── BlogDetailScreen.kt
 ├── 📂 viewmodel
 │   ├── BlogViewModel.kt
 ├── MainActivity.kt
 ├── build.gradle.kts
 ├── AndroidManifest.xml
 └── README.md
 
🏗 How It Works
1️⃣ BlogListScreen.kt → Fetches and displays blog list 📜
2️⃣ Click on a blog → Navigates to WebView 🔗
3️⃣ WebView → Opens full blog post 🌍

💡 Contributing
Contributions are welcome! 🚀

1️⃣ Fork this Repository
Click the Fork button on GitHub.

2️⃣ Create a New Branch
sh
Copy
Edit
git checkout -b feature-branch
3️⃣ Commit Changes
sh
Copy
Edit
git commit -m "Added new feature"
4️⃣ Push and Create Pull Request
sh
Copy
Edit
git push origin feature-branch
Go to GitHub and submit a Pull Request (PR).

🛠 Troubleshooting
❓ Blogs Not Showing?
Check API response in Postman or browser.
Verify that Retrofit is fetching data correctly.
❓ WebView Not Opening?
Ensure INTERNET permission is granted in AndroidManifest.xml.
🔗 License
This project is licensed under the MIT License.

👨‍💻 Author
🔹 Ayman Khan Akhtar
💻 Android Developer | Open Source Enthusiast

⭐ If you like this project, consider giving it a star! ⭐
