<%@page import="kr.or.ddit.middle.vo.AwayVO"%>
<%@page import="kr.or.ddit.middle.vo.LPitcherVO"%>
<%@page import="kr.or.ddit.middle.vo.LBatterVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<!-- <link rel="stylesheet" href="../css/styles.css"> -->
<title>Live Game</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.7.0.min.js"></script>
<%-- <script type="text/javascript" src="<%=request.getContextPath()%>/js/scoreboard.js"></script> --%>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>


<style>
body {
  box-sizing: border-box;
  font-size: 18px;
  font-family: Helvetica Neue, Helvetica, Arial, sans-serif;
}

.container {
  display: grid;
  max-width: 1500px;
  margin: 0 auto;
  grid-template-columns: 1fr 1fr 1fr 1fr 120px;
  grid-template-areas:
    "score score runs outs bases";
  grid-gap: 20px;
  border:10px solid #222;
  background: #222;
  border-radius: 8px;
  margin-top: 1em;
}

.score {
  grid-area: score;
}

.runs {
  grid-area: runs;
  width: 300px;
}

.outs {
  grid-area: outs;
}

.bases {
  
  grid-area: bases;
  display: grid;

  grid-template-columns: 1fr 1fr;
  width: 100px;
  height: 100px;
  margin-top: 50px;
  
  transform: rotate(45deg);
  
}

table {
  background: #222;
  color: #eee;
  }

th, td {
  border: 4px solid #111;
  padding: 15px;
  margin: 0;
  text-align: center;
  vertical-align: middle;
}

table.outs td {
  border: 0;
}

@media (max-width: 750px) {
  .container {
    grid-template-areas:
      "score runs"
      "outs bases";
  }
}
.roster1{
	width : 300px;
	height : 600px;
	float : left;
	flex: 18%;
	margin-right: 2em;
}

.liveGame,.liveChat{
 	border: 2px black solid;
  	width: 300px;
 	height: 600px;
  	flex: 25%;
  	margin: 10px;
}


.roster2{
	width : 300px;
	height : 600px;
	float : right;
	flex: 18%;
	margin-left: 8em;
}

aside {
   padding :10px;
   display: flex;
   flex : 18%;
   width : 300px;
   height : 600px;
   justify-content: space-between;
}

#live{
  display: flex;
  flex : 50%;
  width : 50%;
  justify-content: space-between;
  align-items: center;
}

h2,p{
 padding :5px;
}

.center{
  flex : 50%;
  align-items: center;
}

.all{
	display: flex;
	margin-top: 1em;
}

#outs{
    display: flex;
    justify-content: space-evenly;
    border: 1px solid transparent;
    border-top: 1px solid  rgb(0, 80, 0);
    border-right: 1px solid rgb(0, 80, 0);
    grid-column-start: 1;
    grid-column-end: 3;
    grid-row-start: 3;
    grid-row-end: 4;
}


.empty{
    width: 18px;
    height: 18px;
    background-color: #000;
    border-radius: 50%;
}


.out-filled {
    width: 18px;
    height: 18px;
    background-color: red;
    border: 1px solid #000;
    border-radius: 50%;
}


.ball-filled {
    width: 18px;
    height: 18px;
    background-color: green;
    border: 1px solid #000;
    border-radius: 50%;
}


.strike-filled {
    width: 18px;
    height: 18px;
    background-color: yellow;
    border: 1px solid #000;
    border-radius: 50%;
}

.base {
  background: white;
  width: 45px;
  height: 45px;
}

.onbase {
  background: yellow;
  width: 45px;
  height: 45px;
}

#chatArea {
		display: none;	
		border:2px solid blue;
		padding: 5px;   width : 430px;
		margin: 0px auto;
		margin-top: 0.5em;
}

#connectArea {
		border:2px solid green;	padding: 5px; width : 430px;
		margin: 0px auto;
		margin-top: 0.5em;
}

.teamImage{
	width: 140px;
  	height: 110px;
  	float: right;
}

.homeImage{
	width: 130px;
  	height: 130px;
  	float: right;
}

.team{
	width: 300px;
  	height: 180px;
}

.homeaway{
	width: 80px;
  	height: 20px;
  	float: left;
  	display : flex;
    flex-direction: row;
}

.teamname{
	width: 140px;
  	height: 20px;
  	display : flex;
    flex-direction: row;  	
}  
.info{
	width: 1500px;
  	height: 60px;
  	float: center;
  	margin-top: 0.5em;
  	margin-bottom: 0.5em;
  	border-radius: 8px;
}

table.info td {
  border: 2px solid #111;
  padding: 5px;
  margin: 0;
  text-align: center;
  vertical-align: middle;
}

</style>
</head>


<body>
<%
	// 서블릿에서 보내온 자료를 받는다.
	List<LBatterVO> blist = (List<LBatterVO>)request.getAttribute("Batter");
	List<LPitcherVO> plist = (List<LPitcherVO>)request.getAttribute("Pitcher");
	List<AwayVO> alist = (List<AwayVO>)request.getAttribute("Away");
	int res1 = (Integer)request.getAttribute("Top");
	int res2 = (Integer)request.getAttribute("Bottom");

%>
<div class="container"> <!-- 전광판 -->
  <table class="score">
  <tr>
    <th>&nbsp</th>
    <th>1</th>
    <th>2</th>
    <th>3</th>
    <th>4</th>
    <th>5</th>
    <th>6</th>
    <th>7</th>
    <th>8</th>
    <th>9</th>
    <th>10</th>
    <th>11</th>
    <th>12</th>
  </tr>
  <tr>
  <% 
  if (!alist.isEmpty()) {
      AwayVO awayVO = alist.get(0);
      String aName = awayVO.getA_name();
      String[] aNameParts = aName.split(" "); // 공백을 기준으로 나눔
      String firstPart = aNameParts[0]; // 첫 번째 요소만 가져옴
        %>
    <td><%= firstPart %></td>
     <%
	  }else {
		  %> 
	<td>AWAY</td>  
	<%  
	  }
     %>
    <td><div id="away-score-1">0</div></td>
    <td><div id="away-score-2">0</div></td>
    <td><div id="away-score-3">0</div></td>
    <td><div id="away-score-4">0</div></td>
    <td><div id="away-score-5">0</div></td>
    <td><div id="away-score-6">0</div></td>
    <td><div id="away-score-7">0</div></td>
    <td><div id="away-score-8">0</div></td>
    <td><div id="away-score-9">0</div></td>
    <td><div id="away-score-10">0</div></td>
    <td><div id="away-score-11">0</div></td>
    <td><div id="away-score-12">0</div></td>
  </tr>
  <tr>
    <td>DDIT</td>
    <td><div id="home-score-1">0</div></td>
    <td><div id="home-score-2">0</div></td>
    <td><div id="home-score-3">0</div></td>
    <td><div id="home-score-4">0</div></td>
    <td><div id="home-score-5">0</div></td>
    <td><div id="home-score-6">0</div></td>
    <td><div id="home-score-7">0</div></td>
    <td><div id="home-score-8">0</div></td>
    <td><div id="home-score-9">0</div></td>
    <td><div id="home-score-10">0</div></td>
    <td><div id="home-score-11">0</div></td>
    <td><div id="home-score-12">0</div></td>
  </tr>
</table>

<table class="runs">
  <tr>
    <th>R</th>
    <th>H</th>
    <th>E</th>
  </tr>
  <tr>
    <td><div id="total-away-score">0</div></td>
    <td><div id="away-hit">0</div></td>
    <td>0</td>
  </tr>
  <tr>
    <td><div id="total-home-score">0</div></td>
    <td><div id="home-hit">0</div></td>
    <td>0</td>
  </tr>
</table>
  <table class="outs">
    <tr class="clear-ball"> <!-- 볼 -->
      <td>B</td>
      <td><div class="empty" id="ball-one"></div></td>
      <td><div class="empty" id="ball-two"></div></td>
      <td><div class="empty" id="ball-three"></div></td>
      <td><div class="empty" id="ball-four"></div></td>
    </tr>
    <tr class="clear-strike"> <!-- 스트라이크 -->
      <td>S</td>
      <td><div class="empty" id="strike-one"></div></td>
      <td><div class="empty" id="strike-two"></div></td>
      <td><div class="empty" id="strike-three"></div></td>
    </tr>
    <tr class="clear-out"> <!-- 아웃 -->
      <td>O</td>
      <td><div class="empty" id="out-one"></div></td>
      <td><div class="empty" id="out-two"></div></td>
      <td><div class="empty" id="out-three"></div></td>
    </tr>
  </table>
  <div id="diamond" class="bases"> <!-- 베이스 -->
    <div id="second-base" class="base"></div>
    <div id="first-base" class="base"></div>
    <div id="third-base" class="base"></div>
    <div id="home-plate" class="base"></div>
  </div>
</div>

<div class="info" style="margin: 0 auto; text-align: center;"> <!-- 날씨 -->
	<table class="info">
		<tr>
			<td><h6 class="icon">현재 날씨 : </h6></td>
			<td><h6 id="currentTime">현재 시간 : </h6></td>
			<td><h6 class="ctemp">현재 온도 : </h6></td>
			<td><h6 class="ftemp">체감 온도 : </h6></td>
			<td><h6 class="humid">현재 습도 : </h6></td>
			<td><h6 class="wind">현재 풍속 : </h6></td>
			<td><h6 class="deg">현재 풍향 : </h6></td>
			<td><input type="button" id="startGame" value="게임시작" onclick="start()"></td>
			<td><input type="button" id="slowMode" value="0.5배속" onclick="slowMode()"></td>
			<td><input type="button" id="normalMode" value="1배속" onclick="normalMode()"></td>
			<td><input type="button" id="speedMode" value="2배속" onclick="speedMode()"></td>
		</tr>
	</table>
	
</div>

<div class="all">
<div class="roster1">
<div class="team">
  <h2 class="homeaway">HOME</h2>
  <br><br>
  <p class="teamname">DDIT 언더독스</p>  
  <img class="homeImage" src="<%=request.getContextPath()%>/resources/images/DDIT.png" alt="DDIT.png">
</div> 
  <aside id="left">         
  <table class="table table-dark table-striped">
    <thead>
      <tr>
      	<th>타순</th>
        <th>이름</th>
        <th>포지션</th>
      </tr>
    </thead>
    <tbody>
<%
if (blist != null){
    for(int i = 0; i < 9; i++) {
%>	
      <tr>
      	<td><%=blist.get(i).getLineup() %></td>
        <td><%=blist.get(i).getP_name() %></td>
        <td><%=blist.get(i).getP_position() %></td>
      </tr>
<%
	}
}  
%>

<%
if (plist != null){
    for(int i = 0; i < 1; i++) {
%>	
	 <tr>
	 	<td>P</td>
	 	<td><%=plist.get(0).getP_name() %></td>
	 	<td><%=plist.get(0).getP_position() %></td> 
	 </tr>
<%
	}
}  
%>
    </tbody>
  </table>
  </aside>
</div>


<section id="live">
	<div style="overflow:scroll; width:1000px" id="liveGame" class="liveGame">Live 중계
		
	
	
	
	</div>
	<div style="width:1000px;" class="liveChat">Live 응원
	<!-- 메시지 표시 영역 -->
    <textarea id="messageTextArea" readonly="readonly" rows="17" cols="52"></textarea><br>

    <!-- 송신 메시지 텍스트박스 -->
	<!-- 처음 보내는 메시지는 사용자 이름을 입력하여 보낸다.  -->
	<div id="chatGuide">사용하실 닉네임을 입력해주세요.</div>
    <input type="text" id="messageText" size="50">

    <!-- 송신 버튼 -->
    <input type="button" value="Send" onclick="sendMessage()">
	</div>
</section>



<div class="roster2">

  <div class="team">
  <h2 class="homeaway">AWAY</h2>
        <% 
        if (!alist.isEmpty()) { // 리스트가 비어있지 않은 경우에만 실행
            AwayVO awayVO = alist.get(0); // 첫 번째 항목 가져오기
        %>
        <br><br>
  <p class="teamname"><%=awayVO.getA_name() %></p>  
  <img class="teamImage" src="<%=request.getContextPath()%>/resources/images/<%=awayVO.getA_image()%>" alt="<%=awayVO.getA_image()%>">
  <%
	  }
  %>
 </div> 
  <select id="away" onchange="updateSelectedTeam()">
  	<option value="" selected>상대팀 선택</option>
  	<option value="삼성 라이온즈">삼성라이온즈</option>
  	<option value="두산 베어스">두산베어스</option>
  	<option value="키움 히어로즈">키움히어로즈</option>
  	<option value="LG 트윈스">LG트윈스</option>
  	<option value="기아 타이거즈">기아타아거즈</option>
  	<option value="NC 다이노스">NC다이노스</option>
  	<option value="롯데 자이언츠">롯데자이언츠</option>
  	<option value="SSG 랜더스">SSG랜더스</option>
  	<option value="KT 위즈">KT위즈</option>
  </select> 
    <aside id="right">
      <table class="table table-dark table-striped">
        <thead>
          <tr>
            <th>타순</th>
            <th>이름</th>
            <th>포지션</th>
          </tr>
        </thead>
        <tbody id="rosterBody">
        	<%
        		for(int i = 0; i < alist.size(); i++){
        			AwayVO wayVO = alist.get(i);
        	%>
        		<tr>
        			<td><%=wayVO.getAp_order() %></td>
        			<td><%=wayVO.getAp_name() %></td>
        			<td><%=wayVO.getAp_position() %></td>
        		</tr>
			<%
				}
			%>
		</tbody>
      </table>
    </aside>
</div>

</div>


<script type="text/javascript">
$.getJSON('https://api.openweathermap.org/data/2.5/weather?q=Daejeon&appid=dbcadba28f53edab8b9a109cc30c9d5d&units=metric', function(result){

	var iconUrl = '<img src="https://openweathermap.org/img/wn/'+result.weather[0].icon+'.png" alt="'+result.weather[0].description+'">'
	$('.icon').append(iconUrl);
	$('.ctemp').append(result.main.temp);
	$('.ftemp').append(result.main.feels_like);
	$('.humid').append(result.main.humidity);
	$('.wind').append(result.wind.speed);
	$('.deg').append(result.wind.deg);

});

function displayCurrentTime() {
    var now = new Date(); // 현재 시간을 얻어옴
    
    var hours = now.getHours();
    var minutes = now.getMinutes();
    var seconds = now.getSeconds();
    
    var timeString = "현재시간 : " + hours + ":" + minutes + ":" + seconds;
    
    document.getElementById("currentTime").innerHTML = timeString;
}

// 1초마다 displayCurrentTime 함수를 호출하여 시간을 업데이트
setInterval(displayCurrentTime, 500);


// 함수를 전역적으로 정의
function appendMessage(message) {
    const targetDiv = document.getElementById('liveGame'); // targetDiv를 여기서 찾도록 수정
    const newMessage = document.createElement('p');
    newMessage.textContent = message;
    targetDiv.appendChild(newMessage);
}

function scrollToBottom() {
    var element = document.getElementById('liveGame');
    var bottom = element.scrollHeight - element.clientHeight;
    element.scrollTop = bottom;
}

let speed = 1000;

function scrollToBottom2() {
    var element2 = document.getElementById('messageTextArea');
    var bottom2 = element2.scrollHeight - element2.clientHeight;
    element2.scrollTop = bottom2;
}

function speedMode() {
    speed=0;
    console.log(speed);
}

function normalMode() {
	speed=1000;
	console.log(speed);
}

function slowMode() {
	speed=2000;
	console.log(speed);
}

setInterval(scrollToBottom2, 500);

setInterval(scrollToBottom, 500);

let randomDelay = (Math.random() * 500) + speed;

let strikes = 0;
let outs = 0;
let balls = 0;

let inning = 0;
//최대 이닝
const maxInning = 12;

let homeScore = 0;
let awayScore = 0;

let totalHomeScore = 0;
let totalAwayScore = 0;

let homeHit = 0;
let awayHit = 0;

let lineup = 1;





$("#away").on("change", function(){
	var selectedTeam = $(this).val();
	console.log(selectedTeam);
	
	location.href = "${pageContext.request.contextPath}/liveGame.do?selectedTeam="+selectedTeam;
});

//웹소켓 초기화 (웹소켓 URI 주소 : ws://서버주소:포트번호/컨텍스트이름(프로젝트명)/웹소켓서비스명
// 포트번호 80번은 생략 가능
//	const webSocket = new WebSocket("ws://localhost/webSocketTest/basicsocket");
const contextPath = "<%=request.getContextPath()%>";
const webSocket = new WebSocket("ws://192.168.35.50" + contextPath +"/liveChat");

const messageTextArea = document.getElementById("messageTextArea");

//메시지가 오면 messageTextArea요소에 메시지를 추가한다.
webSocket.onmessage = function processMessge(message){
    //JSON 풀기
    let jsonData = JSON.parse(message.data);
    if(jsonData.message != null) {
        messageTextArea.value += jsonData.message + "\n"
    };
}

//메시지 보내기
function sendMessage(){
    const messageText = document.getElementById("messageText");
    webSocket.send(messageText.value);
    messageText.value = "";
    updateChatGuide();
}


const messageText = document.getElementById("messageText");
messageText.addEventListener("keydown", function(event) {
    if (event.key === "Enter") {
        event.preventDefault();
        sendMessage(); // sendMessage 함수 호출
    }
});


//함수 호출 시 오디오 파일 자동 재생
function playAudio(audioFilePath) {
    const audio = new Audio(audioFilePath);
    audio.play();
    console.log("소리");
}


function onRedDot(dotId) {
    const dot = document.getElementById(dotId); // 해당 ID를 가진 요소 선택

    // 해당 요소의 클래스에 따라 색 변환 처리
    if (dot.classList.contains('empty')) {
      dot.classList.remove('empty');
      dot.classList.add('out-filled');
    }
  }
  
function onGreenDot(dotId) {
    const dot = document.getElementById(dotId); // 해당 ID를 가진 요소 선택

    // 해당 요소의 클래스에 따라 색 변환 처리
    if (dot.classList.contains('empty')) {
      dot.classList.remove('empty');
      dot.classList.add('ball-filled');
    }
  }
  
function onYellowDot(dotId) {
    const dot = document.getElementById(dotId); // 해당 ID를 가진 요소 선택

    // 해당 요소의 클래스에 따라 색 변환 처리
    if (dot.classList.contains('empty')) {
      dot.classList.remove('empty');
      dot.classList.add('strike-filled');
    }
  }
  
function clearRedDot(dotId) {
    const dot = document.getElementById(dotId); // 해당 ID를 가진 요소 선택
    
 // 해당 요소의 클래스에 따라 색 변환 처리
    if (dot.classList.contains('out-filled')) {
      dot.classList.remove('out-filled');
      dot.classList.add('empty');
    }
}

function clearGreenDot(dotId) {
    const dot = document.getElementById(dotId); // 해당 ID를 가진 요소 선택
    
 // 해당 요소의 클래스에 따라 색 변환 처리
    if (dot.classList.contains('ball-filled')) {
      dot.classList.remove('ball-filled');
      dot.classList.add('empty');
    }
}

function clearYellowDot(dotId) {
    const dot = document.getElementById(dotId); // 해당 ID를 가진 요소 선택
    
 // 해당 요소의 클래스에 따라 색 변환 처리
    if (dot.classList.contains('strike-filled')) {
      dot.classList.remove('strike-filled');
      dot.classList.add('empty');
    }
}
  
function clearBallCounts() {
	 clearGreenDot('ball-one');
	 clearGreenDot('ball-two');
	 clearGreenDot('ball-three');
	 clearGreenDot('ball-four');
	 balls = 0;
	}

function clearStrikeCounts() {
	 clearYellowDot('strike-one');
	 clearYellowDot('strike-two');
	 clearYellowDot('strike-three');
	 strikes = 0;
	}
	
function clearOutCounts() {
	 clearRedDot('out-one');
	 clearRedDot('out-two');
	 clearRedDot('out-three');
	 outs = 0;
	}
	
function newBatter() {
	clearBallCounts();
	clearStrikeCounts();
	}




// 베이스 달리기 및 베이스 지우기
function addRunnerFirst () {
    $("#first-base").addClass("onbase").removeClass("base");
}

function addRunnerSecond () {
    $("#second-base").addClass("onbase").removeClass("base");
}

function addRunnerThird () {
    $("#third-base").addClass("onbase").removeClass("base");
}

function addRunnerHome () {
    $("#home-plate").addClass("onbase").removeClass("base");
}

function removeRunnerFirst () {
    $("#first-base").addClass("base").removeClass("onbase");
}

function removeRunnerSecond () {
    $("#second-base").addClass("base").removeClass("onbase");
}

function removeRunnerThird () {
    $("#third-base").addClass("base").removeClass("onbase");
}

function removeRunnerHome () {
    $("#home-plate").addClass("base").removeClass("onbase");
}


//베이스를 지우는 함수
function clearBases () {
    if($("#first-base").hasClass("onbase")){
        $("#first-base").addClass("base").removeClass("onbase");
    }
    if($("#second-base").hasClass("onbase")){
        $("#second-base").addClass("base").removeClass("onbase");
    }
    if($("#third-base").hasClass("onbase")){
        $("#third-base").addClass("base").removeClass("onbase");
    }
    if($("#home-plate").hasClass("onbase")){
        $("#home-plate").addClass("base").removeClass("onbase");
    }
}



function start() {
    console.log("onload");
    const targetDiv = document.getElementById('liveGame');
    appendMessage("3초 후에 경기시작합니다.");
    setTimeout(function() {
        appendMessage("3");
        setTimeout(function() {
            appendMessage("2");
            setTimeout(function() {
                appendMessage("1");
                setTimeout(function() {
                    console.log("start");
                    inning++;
                    console.log(inning + "회 초입니다.");
             		appendMessage(inning + "회 초입니다.");
                    topInning();
                }, 1000);
            }, 1000);
        }, 1000);
    }, 1000);
};


function topInning() {
	console.log("defense");
    return new Promise(function(resolve, reject) {
        $.ajax({
            url: "<%=request.getContextPath()%>/gameProcess.do",
            type: 'GET',
            dataType: 'JSON',
            success: function(response) {
                setTimeout(function() {
                    var res1 = response.res1;
                    if (res1 == 1) {
                    	singlesTop();
                    	awayHit++;
                    	updateHit();
                        topInning();
                    } else if (res1 == 2) {
                    	doublesTop();
                    	awayHit++;
                    	updateHit();
                        topInning();
                    } else if (res1 == 3) {
                    	triplesTop();
                    	awayHit++;
                    	updateHit();
                        topInning();
                    } else if (res1 == 4) {
                    	homerunTop();
                    	awayHit++;
                    	updateHit();
                        topInning();
                    } else if (res1 == 6) {
                    	strike();
                    	strikeoutTop();
                    	topInning();
                    } else if (res1 == 7) { 
                    	ball();
                    	fourBallTop();
                        topInning();
                    } else if (res1 == 8) {
                    	out();           
                    	topToBot();
                    }
                }, randomDelay);
            },
            error: function(xhr) {
                alert("상태: " + xhr.status);
                reject(); // 호출실패
            }
        });
    });
}

function bottomInning() {
    console.log("offense");
    return new Promise(function(resolve, reject) {
        $.ajax({
            url: "<%=request.getContextPath()%>/gameProcess.do",
            type: 'GET',
            dataType: 'JSON',
            success: function(response) {
                setTimeout(function() {
                    var res2 = response.res2;
                    if (res2 == 1) {
                    	singlesBottom();
                    	homeHit++;
                    	updateHit();
                        bottomInning();
                    } else if (res2 == 2) {
                    	doublesBottom();
                    	homeHit++;
                    	updateHit();
                        bottomInning();
                    } else if (res2 == 3) {
                    	triplesBottom();
                    	homeHit++;
                    	updateHit();
                        bottomInning();
                    } else if (res2 == 4) {
                    	homerunBottom();
                    	homeHit++;
                    	updateHit();
                        bottomInning();
                    } else if (res2 == 5) {
                    	hitByPitch();
                        bottomInning();
                    } else if (res2 == 6) {
                    	strike();
                    	strikeoutBottom();
                    	bottomInning();
                    } else if (res2 == 7) {
                    	ball();
                    	fourBallBottom();
                        bottomInning();
                    } else {
                    	out();       
                    	botToTop();
        	 }
   		}, randomDelay);
 },
  error: function(xhr) {
      alert("상태: " + xhr.status);
      reject(); // 호출실패
            }
        });
    });
}



function topToBot(){
	if (outs === 3) {
		clearOutCounts();
		clearBases();
 		console.log("공수 교대");
	 	appendMessage("공수 교대");
	 	if(inning == 9 && totalHomeScore > totalAwayScore){
 	    	location.reload();
 	        alert(totalHomeScore + " : " + totalAwayScore + " DDIT 언더독스 승리!");
 	    }
	 	console.log(inning + "회 말입니다.");
 		appendMessage(inning + "회 말입니다.");
 		awayScore = 0;
 		homeScore = 0;
 		
 		bottomInning();
	 } else {
		topInning();
 	}
}


function botToTop(){
	if (outs === 3) {
		inning++;
		clearOutCounts();
		clearBases();
		checkScore();
 		console.log("공수 교대");
	 	appendMessage("공수 교대");
	 	console.log(inning + "회 초입니다.");
 		appendMessage(inning + "회 초입니다.");
 		topInning();
	 } else {
		bottomInning();
 	}
}


//승패 확인 및 경기 종료 함수
function checkScore() {
	gameOver();
	extraInnings();
}


// 9회 말 종료 시 게임 종료
function gameOver() {
    if(inning == 10 && totalHomeScore < totalAwayScore){
    	location.reload();
        alert(totalHomeScore + " : " + totalAwayScore + " DDIT 언더독스 패배!");
    }else if(inning == 10 && totalHomeScore > totalAwayScore){
    	location.reload();
        alert(totalHomeScore + " : " + totalAwayScore + " DDIT 언더독스 승리!");
    }
}

// 동점 시 연장 이닝 추가 함수
function extraInnings() {
    if(inning > 10 && totalHomeScore > totalAwayScore){
    	location.reload();
        alert(totalHomeScore + " : " + totalAwayScore + " 연장 이닝에서 DDIT 언더독스 승리!");
    }else if(inning > 10 && totalHomeScore < totalAwayScore){
    	location.reload();
        alert(totalHomeScore + " : " + totalAwayScore + " 연장 이닝에서 DDIT 언더독스 패배!");
    }else if(inning == 13 && totalHomeScore == totalAwayScore){
    	location.reload();
        alert(totalHomeScore + " : " + totalAwayScore + " 연장 이닝에서 무승부!");
	}
}


//홈 또는 어웨이 팀에 점수를 추가합니다.
function addRun(team) {
	  if (team === "away" && $("#home-plate").hasClass("onbase")) {
	    console.log("away 팀에 점수 추가");
	    awayScore += 1;
	    $("#away-score-" + inning).html(awayScore);
	    setTimeout(function () {
	      $("#home-plate").removeClass("onbase").addClass("base");
	    }, 1000);
      } else if (team === "home" && $("#home-plate").hasClass("onbase")) {
	    console.log("home 팀에 점수 추가");
	    homeScore += 1;
	    $("#home-score-" + inning).html(homeScore);
	    setTimeout(function () {
	      $("#home-plate").removeClass("onbase").addClass("base");
	    }, 1000);
	} updateTotalScore();
}

function updateChatGuide() {
	
	  document.getElementById("chatGuide").innerText = "부적절한 언어 사용을 자제해주세요.";
}


function updateTotalScore() {
	totalHomeScore = 0;
	totalAwayScore = 0;
	
	  for (let inning = 1; inning <= 12; inning++) {
		totalHomeScore += parseInt(document.getElementById("home-score-" + inning).innerText);
		totalAwayScore += parseInt(document.getElementById("away-score-" + inning).innerText);
	  }

	  document.getElementById("total-home-score").innerText = totalHomeScore;
	  document.getElementById("total-away-score").innerText = totalAwayScore;
}

function updateHit() {
	
	  document.getElementById("home-hit").innerText = homeHit;
	  document.getElementById("away-hit").innerText = awayHit;
}


function singlesTop() {
	playAudio('<%=request.getContextPath()%>/audio/hit.mp3');
	clearBallCounts();
	clearStrikeCounts();
	console.log("1루타");
    appendMessage("1루타");  
    if ($("#first-base").hasClass("base")) {
	    addRunnerFirst();
	} else if ($("#second-base").hasClass("base")) {
	    addRunnerSecond();
	} else if ($("#third-base").hasClass("base")) {
	    addRunnerThird();
	} else if ($("#home-plate").hasClass("base")) {
	    addRunnerHome();
	    addRun("away");
	}
}

function singlesBottom() {
	playAudio('<%=request.getContextPath()%>/audio/hit.mp3');
	clearBallCounts();
	clearStrikeCounts();
	console.log("1루타");
    appendMessage("1루타");  
    if ($("#first-base").hasClass("base")) {
	    addRunnerFirst();
	} else if ($("#second-base").hasClass("base")) {
	    addRunnerSecond();
	} else if ($("#third-base").hasClass("base")) {
	    addRunnerThird();
	} else if ($("#home-plate").hasClass("base")) {
	    addRunnerHome();
	    addRun("home");
	}
}

function doublesTop() {
	playAudio('<%=request.getContextPath()%>/audio/hit.mp3');
	clearBallCounts();
	clearStrikeCounts();
	console.log("2루타");
    appendMessage("2루타"); 
 	// 1루, 2루, 3루가 모두 비어있으면 주자를 2루로 이동시킵니다.
	if ($("#first-base").hasClass("base") && $("#second-base").hasClass("base") && $("#third-base").hasClass("base")) {
	    addRunnerSecond();
	}
	// 1루에 주자가 있고 2루와 3루가 비어있으면 주자를 2루와 3루로 이동시키고 1루를 비웁니다.
	else if ($("#first-base").hasClass("onbase") && $("#second-base").hasClass("base") && $("#third-base").hasClass("base")) {
	    addRunnerSecond();
	    addRunnerThird();
	    removeRunnerFirst();
	}
	// 1루와 2루에 주자가 있고 3루가 비어있다면 주자를 2루와 3루로 이동시키고 점수를 1점 추가합니다. 그리고 1루를 비웁니다.
	else if ($("#first-base").hasClass("onbase") && $("#second-base").hasClass("onbase") && $("#third-base").hasClass("base")) {
	    addRunnerThird();
	    removeRunnerFirst();
	    addRunnerHome();
	    addRun("away");
	}
	// 1루와 2루와 3루에 주자가 모두 있으면 주자를 2루와 3루로 이동시키고 점수를 2점 추가합니다. 그리고 1루를 비웁니다.
	else if ($("#first-base").hasClass("onbase") && $("#second-base").hasClass("onbase") && $("#third-base").hasClass("onbase")) {
	    removeRunnerFirst();
	    addRunnerHome();
	    addRun("away");
	    addRunnerHome();
	    addRun("away");
	}
	// 1루와 3루에 주자가 있고 2루가 비어있다면 주자를 2루로 이동시키고 점수를 1점 추가합니다. 그리고 1루를 비웁니다.
	else if ($("#first-base").hasClass("onbase") && $("#second-base").hasClass("base") && $("#third-base").hasClass("onbase")) {
	    removeRunnerFirst();
	    addRunnerSecond();
	    addRunnerHome();
	    addRun("away");
	}
	// 2루에 주자가 있고 1루와 3루가 비어있다면 주자를 1루로 이동시키고 점수를 1점 추가합니다.
	else if ($("#first-base").hasClass("base") && $("#second-base").hasClass("onbase") && $("#third-base").hasClass("base")) {
	    addRunnerHome();
	    addRun("away");
	}
	// 2루와 3루에 주자가 있고 1루가 비어있다면 주자를 2루와 3루로 이동시키고 점수를 2점 추가합니다.
	else if ($("#first-base").hasClass("base") && $("#second-base").hasClass("onbase") && $("#third-base").hasClass("onbase")) {
	    removeRunnerThird();
	    addRunnerSecond();
	    addRunnerHome();
	    addRun("away");
	    addRunnerHome();
	    addRun("away");
	}
	// 3루에 주자가 있고 1루와 2루가 비어있다면 3루를 비우고 주자를 2루로 이동시키고 점수를 1점 추가합니다.
	else if ($("#first-base").hasClass("base") && $("#second-base").hasClass("base") && $("#third-base").hasClass("onbase")) {
	    removeRunnerThird();
	    addRunnerSecond();
	    addRunnerHome();
	    addRun("away");
	}
}

function doublesBottom() {
	playAudio('<%=request.getContextPath()%>/audio/hit.mp3');
	clearBallCounts();
	clearStrikeCounts();
	console.log("2루타");
    appendMessage("2루타"); 
 	// 1루, 2루, 3루가 모두 비어있으면 주자를 2루로 이동시킵니다.
	if ($("#first-base").hasClass("base") && $("#second-base").hasClass("base") && $("#third-base").hasClass("base")) {
	    addRunnerSecond();
	}
	// 1루에 주자가 있고 2루와 3루가 비어있으면 주자를 2루와 3루로 이동시키고 1루를 비웁니다.
	else if ($("#first-base").hasClass("onbase") && $("#second-base").hasClass("base") && $("#third-base").hasClass("base")) {
	    addRunnerSecond();
	    addRunnerThird();
	    removeRunnerFirst();
	}
	// 1루와 2루에 주자가 있고 3루가 비어있다면 주자를 2루와 3루로 이동시키고 점수를 1점 추가합니다. 그리고 1루를 비웁니다.
	else if ($("#first-base").hasClass("onbase") && $("#second-base").hasClass("onbase") && $("#third-base").hasClass("base")) {
	    addRunnerThird();
	    removeRunnerFirst();
	    addRunnerHome();
	    addRun("home");
	}
	// 1루와 2루와 3루에 주자가 모두 있으면 주자를 2루와 3루로 이동시키고 점수를 2점 추가합니다. 그리고 1루를 비웁니다.
	else if ($("#first-base").hasClass("onbase") && $("#second-base").hasClass("onbase") && $("#third-base").hasClass("onbase")) {
	    removeRunnerFirst();
	    addRunnerHome();
	    addRun("home");
	    addRunnerHome();
	    addRun("home");
	}
	// 1루와 3루에 주자가 있고 2루가 비어있다면 주자를 2루로 이동시키고 점수를 1점 추가합니다. 그리고 1루를 비웁니다.
	else if ($("#first-base").hasClass("onbase") && $("#second-base").hasClass("base") && $("#third-base").hasClass("onbase")) {
	    removeRunnerFirst();
	    addRunnerSecond();
	    addRunnerHome();
	    addRun("home");
	}
	// 2루에 주자가 있고 1루와 3루가 비어있다면 주자를 1루로 이동시키고 점수를 1점 추가합니다.
	else if ($("#first-base").hasClass("base") && $("#second-base").hasClass("onbase") && $("#third-base").hasClass("base")) {
	    addRunnerHome();
	    addRun("home");
	}
	// 2루와 3루에 주자가 있고 1루가 비어있다면 주자를 2루와 3루로 이동시키고 점수를 2점 추가합니다.
	else if ($("#first-base").hasClass("base") && $("#second-base").hasClass("onbase") && $("#third-base").hasClass("onbase")) {
	    removeRunnerThird();
	    addRunnerSecond();
	    addRunnerHome();
	    addRun("home");
	    addRunnerHome();
	    addRun("home");
	}
	// 3루에 주자가 있고 1루와 2루가 비어있다면 3루를 비우고 주자를 2루로 이동시키고 점수를 1점 추가합니다.
	else if ($("#first-base").hasClass("base") && $("#second-base").hasClass("base") && $("#third-base").hasClass("onbase")) {
	    removeRunnerThird();
	    addRunnerSecond();
	    addRunnerHome();
	    addRun("home");
	}
}

function triplesTop() {
	playAudio('<%=request.getContextPath()%>/audio/hit.mp3');
	clearBallCounts();
	clearStrikeCounts();
	console.log("3루타");
    appendMessage("3루타");
 	// 1루, 2루, 3루가 모두 비어있으면 주자를 3루로 이동시킵니다.
	if ($("#first-base").hasClass("base") && $("#second-base").hasClass("base") && $("#third-base").hasClass("base")) {
	    addRunnerThird();
	}
	// 1루에 주자가 있고 2루와 3루가 비어있으면 주자를 3루로 이동시키고 1루를 비웁니다.
	else if ($("#first-base").hasClass("onbase") && $("#second-base").hasClass("base") && $("#third-base").hasClass("base")) {
	    addRunnerThird();
	    removeRunnerFirst();
	    addRunnerHome();
	    addRun("away");
	}
	// 1루와 2루에 주자가 있고 3루가 비어있다면 주자를 3루로 이동시키고 1루와 2루를 비웁니다. 점수를 1점 추가합니다.
	else if ($("#first-base").hasClass("onbase") && $("#second-base").hasClass("onbase") && $("#third-base").hasClass("base")) {
	    addRunnerThird();
	    removeRunnerFirst();
	    removeRunnerSecond();
	    addRunnerHome();
	    addRun("away");
	}
	// 1루와 2루와 3루에 주자가 모두 있으면 1루와 2루와 3루를 비우고 점수를 1점 추가합니다. 
	else if ($("#first-base").hasClass("onbase") && $("#second-base").hasClass("onbase") && $("#third-base").hasClass("onbase")) {
	    removeRunnerFirst();
	    removeRunnerSecond();
	    addRunnerHome();
	    addRun("away");
	    addRunnerHome();
	    addRun("away");
	    addRunnerHome();
	    addRun("away");
	    clearBases();
	}
	// 1루와 3루에 주자가 있고 2루가 비어있다면 주자를 3루로 이동시키고 점수를 2점 추가합니다. 그리고 1루를 비웁니다.
	else if ($("#first-base").hasClass("onbase") && $("#second-base").hasClass("base") && $("#third-base").hasClass("onbase")) {
	    removeRunnerFirst();
	    addRunnerHome();
	    addRun("away");
	    addRunnerHome();
	    addRun("away");
	}
	// 2루에 주자가 있고 1루와 3루가 비어있다면 주자를 1루로 이동시키고 점수를 1점 추가합니다.
	else if ($("#first-base").hasClass("base") && $("#second-base").hasClass("onbase") && $("#third-base").hasClass("base")) {
	    addRunnerHome();
	    addRun("away");
	}
	// 2루와 3루에 주자가 있고 1루가 비어있다면 주자를 2루와 3루로 이동시키고 점수를 2점 추가합니다.
	else if ($("#first-base").hasClass("base") && $("#second-base").hasClass("onbase") && $("#third-base").hasClass("onbase")) {
	    removeRunnerSecond();
	    addRunnerHome();
	    addRun("away");
	    addRunnerHome();
	    addRun("away");
	}
	// 3루에 주자가 있고 1루와 2루가 비어있다면 주자를 3루로 이동시키고 점수를 2점 추가합니다.
	else if ($("#first-base").hasClass("base") && $("#second-base").hasClass("base") && $("#third-base").hasClass("onbase")) {
	    addRunnerHome();
	    addRun("away");
	    addRunnerHome();
	    addRun("away");
	}
}


function triplesBottom() {
	playAudio('<%=request.getContextPath()%>/audio/hit.mp3');
	clearBallCounts();
	clearStrikeCounts();
	console.log("3루타");
    appendMessage("3루타");
 	// 1루, 2루, 3루가 모두 비어있으면 주자를 3루로 이동시킵니다.
	if ($("#first-base").hasClass("base") && $("#second-base").hasClass("base") && $("#third-base").hasClass("base")) {
	    addRunnerThird();
	}
	// 1루에 주자가 있고 2루와 3루가 비어있으면 주자를 3루로 이동시키고 1루를 비웁니다.
	else if ($("#first-base").hasClass("onbase") && $("#second-base").hasClass("base") && $("#third-base").hasClass("base")) {
	    addRunnerThird();
	    removeRunnerFirst();
	    addRunnerHome();
	    addRun("home");
	}
	// 1루와 2루에 주자가 있고 3루가 비어있다면 주자를 3루로 이동시키고 1루와 2루를 비웁니다. 점수를 1점 추가합니다.
	else if ($("#first-base").hasClass("onbase") && $("#second-base").hasClass("onbase") && $("#third-base").hasClass("base")) {
	    addRunnerThird();
	    removeRunnerFirst();
	    removeRunnerSecond();
	    addRunnerHome();
	    addRun("home");
	}
	// 1루와 2루와 3루에 주자가 모두 있으면 1루와 2루와 3루를 비우고 점수를 1점 추가합니다. 
	else if ($("#first-base").hasClass("onbase") && $("#second-base").hasClass("onbase") && $("#third-base").hasClass("onbase")) {
	    removeRunnerFirst();
	    removeRunnerSecond();
	    addRunnerHome();
	    addRun("home");
	    addRunnerHome();
	    addRun("home");
	    addRunnerHome();
	    addRun("home");
	    clearBases();
	}
	// 1루와 3루에 주자가 있고 2루가 비어있다면 주자를 3루로 이동시키고 점수를 2점 추가합니다. 그리고 1루를 비웁니다.
	else if ($("#first-base").hasClass("onbase") && $("#second-base").hasClass("base") && $("#third-base").hasClass("onbase")) {
	    removeRunnerFirst();
	    addRunnerHome();
	    addRun("home");
	    addRunnerHome();
	    addRun("home");
	}
	// 2루에 주자가 있고 1루와 3루가 비어있다면 주자를 1루로 이동시키고 점수를 1점 추가합니다.
	else if ($("#first-base").hasClass("base") && $("#second-base").hasClass("onbase") && $("#third-base").hasClass("base")) {
	    addRunnerHome();
	    addRun("home");
	}
	// 2루와 3루에 주자가 있고 1루가 비어있다면 주자를 2루와 3루로 이동시키고 점수를 2점 추가합니다.
	else if ($("#first-base").hasClass("base") && $("#second-base").hasClass("onbase") && $("#third-base").hasClass("onbase")) {
	    removeRunnerSecond();
	    addRunnerHome();
	    addRun("home");
	    addRunnerHome();
	    addRun("home");
	}
	// 3루에 주자가 있고 1루와 2루가 비어있다면 주자를 3루로 이동시키고 점수를 2점 추가합니다.
	else if ($("#first-base").hasClass("base") && $("#second-base").hasClass("base") && $("#third-base").hasClass("onbase")) {
	    addRunnerHome();
	    addRun("home");
	    addRunnerHome();
	    addRun("home");
	}
}


function homerunTop() {
	playAudio('<%=request.getContextPath()%>/audio/hit.mp3');
	playAudio('<%=request.getContextPath()%>/audio/homerun.mp3');
	clearBallCounts();
	clearStrikeCounts();
	console.log("홈런!");
    appendMessage("홈런!");
 	// 1루, 2루, 3루가 모두 비어있으면 점수를 1점 추가합니다.
	if ($("#first-base").hasClass("base") && $("#second-base").hasClass("base") && $("#third-base").hasClass("base")) {
	    addRunnerHome();
	    addRun("away");
	}
	// 1루에 주자가 있고 2루와 3루가 비어있으면 주자를 홈플레이트로 이동시키고 점수를 1점 추가합니다.
	else if ($("#first-base").hasClass("onbase") && $("#second-base").hasClass("base") && $("#third-base").hasClass("base")) {
	    addRunnerHome();
	    addRun("away");
	}
	// 1루와 2루에 주자가 있고 3루가 비어있다면 주자를 홈플레이트로 이동시키고 점수를 2점 추가합니다.
	else if ($("#first-base").hasClass("onbase") && $("#second-base").hasClass("onbase") && $("#third-base").hasClass("base")) {
	    addRunnerHome();
	    addRun("away");
	    addRunnerHome();
	    addRun("away");
	}
	// 1루와 2루와 3루에 주자가 모두 있으면 주자를 홈플레이트로 이동시키고 점수를 4점 추가합니다. 베이스를 비웁니다.
	else if ($("#first-base").hasClass("onbase") && $("#second-base").hasClass("onbase") && $("#third-base").hasClass("onbase")) {
	    addRunnerHome();
	    addRun("away");
	    addRunnerHome();
	    addRun("away");
	    addRunnerHome();
	    addRun("away");
	    addRunnerHome();
	    addRun("away");
	    clearBases();
	    appendMessage("만루 홈런!!!");  
	}
	// 1루와 3루에 주자가 있고 2루가 비어있다면 주자를 홈플레이트로 이동시키고 점수를 3점 추가합니다. 베이스를 비웁니다.
	else if ($("#first-base").hasClass("onbase") && $("#second-base").hasClass("base") && $("#third-base").hasClass("onbase")) {
	    removeRunnerFirst();
	    addRunnerHome();
	    addRun("away");
	    addRunnerHome();
	    addRun("away");
	    addRunnerHome();
	    addRun("away");
	    clearBases();
	}
	// 2루에 주자가 있고 1루와 3루가 비어있다면 주자를 홈플레이트로 이동시키고 점수를 2점 추가합니다. 베이스를 비웁니다.
	else if ($("#first-base").hasClass("base") && $("#second-base").hasClass("onbase") && $("#third-base").hasClass("base")) {
	    addRunnerHome();
	    addRun("away");
	    addRunnerHome();
	    addRun("away");
	    clearBases();
	}
	// 2루와 3루에 주자가 있고 1루가 비어있다면 주자를 홈플레이트로 이동시키고 점수를 3점 추가합니다. 베이스를 비웁니다.
	else if ($("#first-base").hasClass("base") && $("#second-base").hasClass("onbase") && $("#third-base").hasClass("onbase")) {
	    removeRunnerSecond();
	    addRunnerHome();
	    addRun("away");
	    addRunnerHome();
	    addRun("away");
	    addRunnerHome();
	    addRun("away");
	    clearBases();
	}
	// 3루에 주자가 있고 1루와 2루가 비어있다면 주자를 홈플레이트로 이동시키고 점수를 2점 추가합니다. 베이스를 비웁니다.
	else if ($("#first-base").hasClass("base") && $("#second-base").hasClass("base") && $("#third-base").hasClass("onbase")) {
	    addRunnerHome();
	    addRun("away");
	    addRunnerHome();
	    addRun("away");
	    clearBases();
	}
}


function homerunBottom() {
	playAudio('<%=request.getContextPath()%>/audio/hit.mp3');
	playAudio('<%=request.getContextPath()%>/audio/homerun.mp3');
	clearBallCounts();
	clearStrikeCounts();
	console.log("홈런!");
    appendMessage("홈런!");
 	// 1루, 2루, 3루가 모두 비어있으면 점수를 1점 추가합니다.
	if ($("#first-base").hasClass("base") && $("#second-base").hasClass("base") && $("#third-base").hasClass("base")) {
	    addRunnerHome();
	    addRun("home");
	}
	// 1루에 주자가 있고 2루와 3루가 비어있으면 주자를 홈플레이트로 이동시키고 점수를 1점 추가합니다.
	else if ($("#first-base").hasClass("onbase") && $("#second-base").hasClass("base") && $("#third-base").hasClass("base")) {
	    addRunnerHome();
	    addRun("home");
	}
	// 1루와 2루에 주자가 있고 3루가 비어있다면 주자를 홈플레이트로 이동시키고 점수를 2점 추가합니다.
	else if ($("#first-base").hasClass("onbase") && $("#second-base").hasClass("onbase") && $("#third-base").hasClass("base")) {
	    addRunnerHome();
	    addRun("home");
	    addRunnerHome();
	    addRun("home");
	}
	// 1루와 2루와 3루에 주자가 모두 있으면 주자를 홈플레이트로 이동시키고 점수를 4점 추가합니다. 베이스를 비웁니다.
	else if ($("#first-base").hasClass("onbase") && $("#second-base").hasClass("onbase") && $("#third-base").hasClass("onbase")) {
	    addRunnerHome();
	    addRun("home");
	    addRunnerHome();
	    addRun("home");
	    addRunnerHome();
	    addRun("home");
	    addRunnerHome();
	    addRun("home");
	    clearBases();
	    appendMessage("만루 홈런!!!");  
	}
	// 1루와 3루에 주자가 있고 2루가 비어있다면 주자를 홈플레이트로 이동시키고 점수를 3점 추가합니다. 베이스를 비웁니다.
	else if ($("#first-base").hasClass("onbase") && $("#second-base").hasClass("base") && $("#third-base").hasClass("onbase")) {
	    removeRunnerFirst();
	    addRunnerHome();
	    addRun("home");
	    addRunnerHome();
	    addRun("home");
	    addRunnerHome();
	    addRun("home");
	    clearBases();
	}
	// 2루에 주자가 있고 1루와 3루가 비어있다면 주자를 홈플레이트로 이동시키고 점수를 2점 추가합니다. 베이스를 비웁니다.
	else if ($("#first-base").hasClass("base") && $("#second-base").hasClass("onbase") && $("#third-base").hasClass("base")) {
	    addRunnerHome();
	    addRun("home");
	    addRunnerHome();
	    addRun("home");
	    clearBases();
	}
	// 2루와 3루에 주자가 있고 1루가 비어있다면 주자를 홈플레이트로 이동시키고 점수를 3점 추가합니다. 베이스를 비웁니다.
	else if ($("#first-base").hasClass("base") && $("#second-base").hasClass("onbase") && $("#third-base").hasClass("onbase")) {
	    removeRunnerSecond();
	    addRunnerHome();
	    addRun("home");
	    addRunnerHome();
	    addRun("home");
	    addRunnerHome();
	    addRun("home");
	    clearBases();
	}
	// 3루에 주자가 있고 1루와 2루가 비어있다면 주자를 홈플레이트로 이동시키고 점수를 2점 추가합니다. 베이스를 비웁니다.
	else if ($("#first-base").hasClass("base") && $("#second-base").hasClass("base") && $("#third-base").hasClass("onbase")) {
	    addRunnerHome();
	    addRun("home");
	    addRunnerHome();
	    addRun("home");
	    clearBases();
	}
}


function hitByPitch() {
	clearBallCounts();
	clearStrikeCounts();
	console.log("몸에 맞는 공");
    appendMessage("몸에 맞는 공");
    addRun("home");
}

function strike() {
	strikes++;
	console.log("스트라이크:" + strikes);
    appendMessage(strikes + "스트라이크");
    if (strikes===1) {
    	onYellowDot('strike-one');
    }else if (strikes===2) {
    	onYellowDot('strike-two');
    }else if (strikes===3) {
    	onYellowDot('strike-three');	
    }
}

function strikeoutTop() {
	if (strikes === 3) {
		outs++;
		clearBallCounts();
		clearStrikeCounts();
        console.log("스트라이크 아웃!");
        appendMessage("스트라이크 아웃!");
        if (outs===1) {
        	onRedDot('out-one');
        }else if (outs===2) {
        	onRedDot('out-two');
        }else if (outs===3) {
        	onRedDot('out-three');
        	topToBot();
        }
    } 
}

function strikeoutBottom() {
	if (strikes === 3) {
		outs++;
		clearBallCounts();
		clearStrikeCounts();
        console.log("스트라이크 아웃!");
        appendMessage("스트라이크 아웃!");
        if (outs===1) {
        	onRedDot('out-one');
        }else if (outs===2) {
        	onRedDot('out-two');
        }else if (outs===3) {
        	onRedDot('out-three');	
        	botToTop();
        }
	}
}

function ball() {
	balls++;
    appendMessage(balls + "볼");
    console.log("볼:" + balls);
    // 예시로 'ball-one' ID를 가진 동그라미를 호출 시 색 변환
     if (balls===1) {
        	onGreenDot('ball-one');
        }else if (balls===2) {
        	onGreenDot('ball-two');
        }else if (balls===3) {
        	onGreenDot('ball-three');	
        }else if (balls===4) {
        	onGreenDot('ball-four');
        }
    
}

function fourBallTop() {
	if(balls===4){
		clearBallCounts();
		clearStrikeCounts();
        console.log("볼넷");
        appendMessage("볼넷 출루");
        addRun("away");
	}
}

function fourBallBottom() {
	if(balls===4){
		clearBallCounts();
		clearStrikeCounts();
        console.log("볼넷");
        appendMessage("볼넷 출루");
        addRun("home");
	}
}
<%
if (!blist.isEmpty()) {
	int b = 0;
    LBatterVO batterVO = blist.get(b);
%>
function out() {
	outs++;
	clearBallCounts();
	clearStrikeCounts();
  	appendMessage(outs + "아웃");
  	console.log("아웃" + outs); 
  	<%  %>
  	 if(outs===1){
     	onRedDot('out-one');
     }
     if(outs===2){
     	onRedDot('out-two');
     }
     if(outs===3){
     	onRedDot('out-three');
     }   
}
<%  
}
%>

	
</script>
</body>
</html>