<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Simple Chatbot Example</title>
       <style>
          body {
            font-family: "Noto Sans KR", Arial, sans-serif;
            margin: 0;
            padding: 0;
            background: linear-gradient(to bottom, #f0f5f9, #c9d6e3);
        }

        #container {
            width: 80%;
            margin: auto;
            padding: 20px;
        }

        #chatbox {
            background-color: #f8f8f8;
            border-radius: 8px;
            padding: 20px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }

        #userInput {
            width: 98.3%;
            padding: 12px;
            border: 1px solid #ccc;
            border-radius: 5px;
            margin-top: 15px;
            transition: border-color 0.3s ease;
        }

        /* 채팅창 안의 텍스트 스타일 */
        #chatbox p {
            margin: 10px 0;
            font-size: 14px;
        }

        #chatbox strong {
            color: #007bff;
        }

        #chatbox {
            background-color: #ffffff;
            border-radius: 8px;
            padding: 20px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }

        #userInput {
            width: 98.3%;
            padding: 12px;
            border: 1px solid #ccc;
            border-radius: 5px;
            margin-top: 15px;
            transition: border-color 0.3s ease;
        }

        #submitBtn {
            display: block;
            width: 100%;
            background-color: #007bff;
            color: #fff;
            padding: 12px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease, opacity 0.3s ease;
        }

        #submitBtn:hover {
            background-color: #0056b3;
        }

        #submitBtn:active {
            opacity: 0.9;
        }

        #chatbotResponse {
            animation: fadeIn ease 1s;
            animation-fill-mode: forwards;
        }

        @keyframes fadeIn {
            from {
                opacity: 0;
            }
            to {
                opacity: 1;
            }
    
}


        h1 {
            text-align: center;
            margin-bottom: 20px;
            color: #007bff;
        }

        p {
            margin: 10px 0;
        }
        

    </style>
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300;400;500;700&display=swap" rel="stylesheet">
</head>
<body>
    <div id="container">
        <h1>DDIT언더독스 FAQ</h1>
        <div id="chatbox">
            <p><strong>챗봇:</strong> 안녕하세요! 어떤 도움을 드릴까요?</p>
            <c:if test="${not empty chatbotResponse}">
                <p><strong>사용자:</strong> ${param.userInput}</p>
                <p><strong>챗봇:</strong> <span id="chatbotResponse">${chatbotResponse}</span></p>
            </c:if>
        </div>
        <form action="<%=request.getContextPath() %>/chatServlet.do" method="post">
            <input type="text" name="userInput" id="userInput" placeholder="메시지를 입력하세요..." />
            <button type="submit" id="submitBtn">전송</button>
        </form>
    </div>
    
    <script>
    
    
        const chatbotResponseElement = document.getElementById('chatbotResponse');
        let chatbotResponseText = chatbotResponseElement.textContent;
        let index = 0;

        function displayChatbotResponse() {
            chatbotResponseElement.textContent = chatbotResponseText.substring(0, index);
            index++;

            if (index <= chatbotResponseText.length) {
                setTimeout(displayChatbotResponse, 100); // Adjust the timing as needed
            }
        }

        displayChatbotResponse();
    </script>
</body>
</html>