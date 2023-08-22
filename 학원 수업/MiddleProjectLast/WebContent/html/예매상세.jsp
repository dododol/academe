<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>예매상세</title>
		<link rel="stylesheet" href="../resources/css/예매상세.css">
	<link rel="shortcut icon" href="../resources/images/미니.png">
	<script type="text/javascript" src="../resources/js/jquery-3.7.0.min.js"></script>
</head>
<script>
window.onload=function(){
	   hlist = document.querySelectorAll('#Aall .Achar');
	   for(i=0; i<hlist.length; i++){
		   hlist[i].addEventListener('click', changeColor);
	   }
	   hlist = document.querySelectorAll('#Ball .Bchar');
	   for(i=0; i<hlist.length; i++){
			   hlist[i].addEventListener('click', changeColor);
		   }
	   hlist = document.querySelectorAll('#Fall .Fchar');
	   for(i=0; i<hlist.length; i++){
			   hlist[i].addEventListener('click', changeColor);
		   }
	   hlist = document.querySelectorAll('#Sall .Schar');
	   for(i=0; i<hlist.length; i++){
			   hlist[i].addEventListener('click', changeColor);
		   }
	   hlist = document.querySelectorAll('#Rall .Rchar');
	   for(i=0; i<hlist.length; i++){
			   hlist[i].addEventListener('click', changeColor2);
		   }
	   hlist = document.querySelectorAll('#HRall .HRchar');
	   for(i=0; i<hlist.length; i++){
			   hlist[i].addEventListener('click', changeColor);
		   }
	   hlist = document.querySelectorAll('#HR2-all .HR2-char');
	   for(i=0; i<hlist.length; i++){
			   hlist[i].addEventListener('click', changeColor);
		   }
}
changeColor = function(){
	this.style.background ='darkred';
}
changeColor2 = function(){
	this.style.background ='darkblue';
}

	$(function(){
	    $('#A').click(function(){
		    if($("#Aall").css("display") == "none"){
	            $('#Aall').show();
	    	}
	    });	    
	});
	$(function(){
	    $('#A').click(function(){
		    if($("#chocebutton").css("display") != "none"){
	            $('#chocebutton').hide();
	    	}
	    });
	});
	$(function(){
	    $('#B').click(function(){
		    if($("#Ball").css("display") == "none"){
	            $('#Ball').show();
	    	}
	    });	    
	});
	$(function(){
	    $('#B').click(function(){
		    if($("#chocebutton").css("display") != "none"){
	            $('#chocebutton').hide();
	    	}
	    });
	});
	$(function(){
	    $('#F').click(function(){
		    if($("#Fall").css("display") == "none"){
	            $('#Fall').show();
	    	}
	    });	    
	});
	$(function(){
	    $('#F').click(function(){
		    if($("#chocebutton").css("display") != "none"){
	            $('#chocebutton').hide();
	    	}
	    });
	});
	$(function(){
	    $('#S').click(function(){
		    if($("#Sall").css("display") == "none"){
	            $('#Sall').show();
	    	}
	    });	    
	});
	$(function(){
	    $('#S').click(function(){
		    if($("#chocebutton").css("display") != "none"){
	            $('#chocebutton').hide();
	    	}
	    });
	});
	$(function(){
	    $('#R').click(function(){
		    if($("#Rall").css("display") == "none"){
	            $('#Rall').show();
	    	}
	    });	    
	});
	$(function(){
	    $('#R').click(function(){
		    if($("#chocebutton").css("display") != "none"){
	            $('#chocebutton').hide();
	    	}
	    });
	});
	$(function(){
	    $('#HR').click(function(){
		    if($("#HRall").css("display") == "none"){
	            $('#HRall').show();
	    	}
	    });	    
	});
	$(function(){
	    $('#HR').click(function(){
		    if($("#chocebutton").css("display") != "none"){
	            $('#chocebutton').hide();
	    	}
	    });
	});
	$(function(){
	    $('#HR2').click(function(){
		    if($("#HR2-all").css("display") == "none"){
	            $('#HR2-all').show();
	    	}
	    });	    
	});
	$(function(){
	    $('#HR2').click(function(){
		    if($("#chocebutton").css("display") != "none"){
	            $('#chocebutton').hide();
	    	}
	    });
	});
	$(function(){
	    $('#backA').click(function(){
		    if($("#chocebutton").css("display") == "none"){
	            $('#chocebutton').show();
	    	}
	    });
	});
	$(function(){
	    $('#backB').click(function(){
		    if($("#chocebutton").css("display") == "none"){
	            $('#chocebutton').show();
	    	}
	    });
	});
	$(function(){
	    $('#backF').click(function(){
		    if($("#chocebutton").css("display") == "none"){
	            $('#chocebutton').show();
	    	}
	    });
	});
	$(function(){
	    $('#backS').click(function(){
		    if($("#chocebutton").css("display") == "none"){
	            $('#chocebutton').show();
	    	}
	    });
	});
	$(function(){
	    $('#backR').click(function(){
		    if($("#chocebutton").css("display") == "none"){
	            $('#chocebutton').show();
	    	}
	    });
	});
	$(function(){
	    $('#backHR').click(function(){
		    if($("#chocebutton").css("display") == "none"){
	            $('#chocebutton').show();
	    	}
	    });
	});
	$(function(){
	    $('#backHR2').click(function(){
		    if($("#chocebutton").css("display") == "none"){
	            $('#chocebutton').show();
	    	}
	    });
	});
	$(function(){
	    $('#backA').click(function(){
		    if($("#Aall").css("display") != "none"){
	            $('#Aall').hide();
	    	}
	    });	    
	});
	$(function(){
	    $('#backB').click(function(){
		    if($("#Ball").css("display") != "none"){
	            $('#Ball').hide();
	    	}
	    });	    
	});
	$(function(){
	    $('#backS').click(function(){
		    if($("#Sall").css("display") != "none"){
	            $('#Sall').hide();
	    	}
	    });	    
	});
	$(function(){
	    $('#backHR').click(function(){
		    if($("#HRall").css("display") != "none"){
	            $('#HRall').hide();
	    	}
	    });	    
	});
	$(function(){
	    $('#backR').click(function(){
		    if($("#Rall").css("display") != "none"){
	            $('#Rall').hide();
	    	}
	    });	    
	});
	$(function(){
	    $('#backHR2').click(function(){
		    if($("#HR2-all").css("display") != "none"){
	            $('#HR2-all').hide();
	    	}
	    });	    
	});
	$(function(){
	    $('#backF').click(function(){
		    if($("#Fall").css("display") != "none"){
	            $('#Fall').hide();
	    	}
	    });	    
	});
	$(function(){
	    $('#cheakA').click(function(){
		    if($("#Aall").css("display") != "none"){
	            $('#Aall').hide();
	    	}
	    });	    
	});
	$(function(){
	    $('#cheakA').click(function(){
		    if($("#Aall").css("display") == "none"){
	            $('#allsum').show();
	    	}
	    });	    
	});
	$(function(){
	    $('#cheakB').click(function(){
		    if($("#Ball").css("display") != "none"){
	            $('#Ball').hide();
	    	}
	    });	    
	});
	$(function(){
	    $('#cheakB').click(function(){
		    if($("#Ball").css("display") == "none"){
	            $('#allsum').show();
	    	}
	    });	    
	});
	$(function(){
	    $('#cheakS').click(function(){
		    if($("#Sall").css("display") != "none"){
	            $('#Sall').hide();
	    	}
	    });	    
	});
	$(function(){
	    $('#cheakS').click(function(){
		    if($("#Sall").css("display") == "none"){
	            $('#allsum').show();
	    	}
	    });	    
	});
	$(function(){
	    $('#cheakF').click(function(){
		    if($("#Fall").css("display") != "none"){
	            $('#Fall').hide();
	    	}
	    });	    
	});
	$(function(){
	    $('#cheakF').click(function(){
		    if($("#Fall").css("display") == "none"){
	            $('#allsum').show();
	    	}
	    });	    
	});
	$(function(){
	    $('#cheakR').click(function(){
		    if($("#Rall").css("display") != "none"){
	            $('#Rall').hide();
	    	}
	    });	    
	});
	$(function(){
	    $('#cheakR').click(function(){
		    if($("#Rall").css("display") == "none"){
	            $('#allsum').show();
	    	}
	    });	    
	});
	$(function(){
	    $('#cheakHR').click(function(){
		    if($("#HRall").css("display") != "none"){
	            $('#HRall').hide();
	    	}
	    });	    
	});
	$(function(){
	    $('#cheakHR').click(function(){
		    if($("#HRall").css("display") == "none"){
	            $('#allsum').show();
	    	}
	    });	    
	});
	$(function(){
	    $('#cheakHR2').click(function(){
		    if($("#HR2-all").css("display") != "none"){
	            $('#HR2-all').hide();
	    	}
	    });	    
	});
	$(function(){
	    $('#cheakHR2').click(function(){
		    if($("#HR2-all").css("display") == "none"){
	            $('#allsum').show();
	    	}
	    });	    
	});
	$(document).ready(function() {
	    // 선택한 좌석 정보를 저장하는 변수들
	    let selectedSite = '';
	    let selectedCharNum = '';
	    let selectedTiketCount = 0;
	    let seatPrice = 0;

	    // A 버튼 클릭 시
	    $('#A').click(function() {
	        selectedSite = 'A';
	        seatPrice = 10000; // A 좌석 가격 설정 (변경 가능)
	        $('#AH2').text(selectedSite);
	        $('.Aclass').show(); // 좌석 선택 메뉴 보이기
	    });

	    // 좌석 선택 시
	    $('.Achar').click(function() {
	        $(this).toggleClass('active'); // 좌석 활성화 클래스 추가/제거
	        updateSelectedSeats(); // 선택된 좌석 업데이트
	    });

	    // 선택된 좌석 업데이트
	    function updateSelectedSeats() {
	        selectedSeats = []; // 선택한 좌석 배열 초기화
	        $('.Achar.active').each(function() {
	            selectedSeats.push($(this).text()); // 선택한 좌석 번호 추가
	        });
	        $('#charnumtd').text(selectedSeats.join(', '));
	        $('#tiketsutd').text(selectedSeats.length);
	        $('#moneytd').text(seatPrice.toLocaleString());
	        $('#allmoneytd').text((selectedSeats.length * seatPrice).toLocaleString());
	    }

	    // 확인 버튼 클릭 시
	    $('#cheakA').click(function() {
	        updateSelectedSeats(); // 선택한 좌석 업데이트
	    });
	});
	$(document).ready(function() {
	    // 선택한 좌석 정보를 저장하는 변수들
	    let selectedSite = '';
	    let selectedCharNum = '';
	    let selectedTiketCount = 0;
	    let seatPrice = 0;

	    // B 버튼 클릭 시
	    $('#B').click(function() {
	        selectedSite = 'B';
	        seatPrice = 10000; // B 좌석 가격 설정 (변경 가능)
	        $('#BH2').text(selectedSite);
	        $('.Bclass').show(); // 좌석 선택 메뉴 보이기
	    });

	    // 좌석 선택 시
	    $('.Bchar').click(function() {
	        $(this).toggleClass('active'); // 좌석 활성화 클래스 추가/제거
	        updateSelectedSeats(); // 선택된 좌석 업데이트
	    });

	    // 선택된 좌석 업데이트
	    function updateSelectedSeats() {
	        selectedSeats = []; // 선택한 좌석 배열 초기화
	        $('.Bchar.active').each(function() {
	            selectedSeats.push($(this).text()); // 선택한 좌석 번호 추가
	        });
	        $('#sitetd').text(selectedSite.toLocaleString());
	        $('#charnumtd').text(selectedSeats.join(', '));
	        $('#tiketsutd').text(selectedSeats.length);
	        $('#moneytd').text(seatPrice.toLocaleString());
	        $('#allmoneytd').text((selectedSeats.length * seatPrice).toLocaleString());
	    }

	    // 확인 버튼 클릭 시
	    $('#cheakB').click(function() {
	        updateSelectedSeats(); // 선택한 좌석 업데이트
	    });
	});
	$(document).ready(function() {
	    // 선택한 좌석 정보를 저장하는 변수들
	    let selectedSite = '';
	    let selectedCharNum = '';
	    let selectedTiketCount = 0;
	    let seatPrice = 0;

	    // F 버튼 클릭 시
	    $('#F').click(function() {
	        selectedSite = 'F';
	        seatPrice = 15000; // A 좌석 가격 설정 (변경 가능)
	        $('#FH2').text(selectedSite);
	        $('.Fclass').show(); // 좌석 선택 메뉴 보이기
	    });

	    // 좌석 선택 시
	    $('.Fchar').click(function() {
	        $(this).toggleClass('active'); // 좌석 활성화 클래스 추가/제거
	        updateSelectedSeats(); // 선택된 좌석 업데이트
	    });

	    // 선택된 좌석 업데이트
	    function updateSelectedSeats() {
	        selectedSeats = []; // 선택한 좌석 배열 초기화
	        $('.Fchar.active').each(function() {
	            selectedSeats.push($(this).text()); // 선택한 좌석 번호 추가
	        });
	        $('#sitetd').text(selectedSite.toLocaleString());
	        $('#charnumtd').text(selectedSeats.join(', '));
	        $('#tiketsutd').text(selectedSeats.length);
	        $('#moneytd').text(seatPrice.toLocaleString());
	        $('#allmoneytd').text((selectedSeats.length * seatPrice).toLocaleString());
	    }

	    // 확인 버튼 클릭 시
	    $('#cheakF').click(function() {
	        updateSelectedSeats(); // 선택한 좌석 업데이트
	    });
	});
	$(document).ready(function() {
	    // 선택한 좌석 정보를 저장하는 변수들
	    let selectedSite = '';
	    let selectedCharNum = '';
	    let selectedTiketCount = 0;
	    let seatPrice = 0;

	    // R 버튼 클릭 시
	    $('#R').click(function() {
	        selectedSite = 'R';
	        seatPrice = 25000; // A 좌석 가격 설정 (변경 가능)
	        $('#RH2').text(selectedSite);
	        $('.Rclass').show(); // 좌석 선택 메뉴 보이기
	    });

	    // 좌석 선택 시
	    $('.Rchar').click(function() {
	        $(this).toggleClass('active'); // 좌석 활성화 클래스 추가/제거
	        updateSelectedSeats(); // 선택된 좌석 업데이트
	    });

	    // 선택된 좌석 업데이트
	    function updateSelectedSeats() {
	        selectedSeats = []; // 선택한 좌석 배열 초기화
	        $('.Rchar.active').each(function() {
	            selectedSeats.push($(this).text()); // 선택한 좌석 번호 추가
	        });
	        $('#sitetd').text(selectedSite.toLocaleString());
	        $('#charnumtd').text(selectedSeats.join(', '));
	        $('#tiketsutd').text(selectedSeats.length);
	        $('#moneytd').text(seatPrice.toLocaleString());
	        $('#allmoneytd').text((selectedSeats.length * seatPrice).toLocaleString());
	    }

	    // 확인 버튼 클릭 시
	    $('#cheakR').click(function() {
	        updateSelectedSeats(); // 선택한 좌석 업데이트
	    });
	});
	$(document).ready(function() {
	    // 선택한 좌석 정보를 저장하는 변수들
	    let selectedSite = '';
	    let selectedCharNum = '';
	    let selectedTiketCount = 0;
	    let seatPrice = 0;

	    // S 버튼 클릭 시
	    $('#S').click(function() {
	        selectedSite = 'S';
	        seatPrice = 30000; // A 좌석 가격 설정 (변경 가능)
	        $('#SH2').text(selectedSite);
	        $('.Sclass').show(); // 좌석 선택 메뉴 보이기
	    });

	    // 좌석 선택 시
	    $('.Schar').click(function() {
	        $(this).toggleClass('active'); // 좌석 활성화 클래스 추가/제거
	        updateSelectedSeats(); // 선택된 좌석 업데이트
	    });

	    // 선택된 좌석 업데이트
	    function updateSelectedSeats() {
	        selectedSeats = []; // 선택한 좌석 배열 초기화
	        $('.Schar.active').each(function() {
	            selectedSeats.push($(this).text()); // 선택한 좌석 번호 추가
	        });
	        $('#sitetd').text(selectedSite.toLocaleString());
	        $('#charnumtd').text(selectedSeats.join(', '));
	        $('#tiketsutd').text(selectedSeats.length);
	        $('#moneytd').text(seatPrice.toLocaleString());
	        $('#allmoneytd').text((selectedSeats.length * seatPrice).toLocaleString());
	    }

	    // 확인 버튼 클릭 시
	    $('#cheakS').click(function() {
	        updateSelectedSeats(); // 선택한 좌석 업데이트
	    });
	});
	$(document).ready(function() {
	    // 선택한 좌석 정보를 저장하는 변수들
	    let selectedSite = '';
	    let selectedCharNum = '';
	    let selectedTiketCount = 0;
	    let seatPrice = 0;

	    // HR 버튼 클릭 시
	    $('#HR').click(function() {
	        selectedSite = 'HR';
	        seatPrice = 15000; // A 좌석 가격 설정 (변경 가능)
	        $('#HRH2').text(selectedSite);
	        $('.HRclass').show(); // 좌석 선택 메뉴 보이기
	    });

	    // 좌석 선택 시
	    $('.HRchar').click(function() {
	        $(this).toggleClass('active'); // 좌석 활성화 클래스 추가/제거
	        updateSelectedSeats(); // 선택된 좌석 업데이트
	    });

	    // 선택된 좌석 업데이트
	    function updateSelectedSeats() {
	        selectedSeats = []; // 선택한 좌석 배열 초기화
	        $('.HRchar.active').each(function() {
	            selectedSeats.push($(this).text()); // 선택한 좌석 번호 추가
	        });
	        $('#sitetd').text(selectedSite.toLocaleString());
	        $('#charnumtd').text(selectedSeats.join(', '));
	        $('#tiketsutd').text(selectedSeats.length);
	        $('#moneytd').text(seatPrice.toLocaleString());
	        $('#allmoneytd').text((selectedSeats.length * seatPrice).toLocaleString());
	    }

	    // 확인 버튼 클릭 시
	    $('#cheakHR').click(function() {
	        updateSelectedSeats(); // 선택한 좌석 업데이트
	    });
	});
	$(document).ready(function() {
	    // 선택한 좌석 정보를 저장하는 변수들
	    let selectedSite = '';
	    let selectedCharNum = '';
	    let selectedTiketCount = 0;
	    let seatPrice = 0;

	    // HR2 버튼 클릭 시
	    $('#HR2').click(function() {
	        selectedSite = 'HR2';
	        seatPrice = 20000; // A 좌석 가격 설정 (변경 가능)
	        $('#HR2-H2').text(selectedSite);
	        $('.HR2-class').show(); // 좌석 선택 메뉴 보이기
	    });

	    // 좌석 선택 시
	    $('.HR2-char').click(function() {
	        $(this).toggleClass('active'); // 좌석 활성화 클래스 추가/제거
	        updateSelectedSeats(); // 선택된 좌석 업데이트
	    });

	    // 선택된 좌석 업데이트
	    function updateSelectedSeats() {
	        selectedSeats = []; // 선택한 좌석 배열 초기화
	        $('.HR2-char.active').each(function() {
	            selectedSeats.push($(this).text()); // 선택한 좌석 번호 추가
	        });
	        $('#sitetd').text(selectedSite.toLocaleString());
	        $('#charnumtd').text(selectedSeats.join(', '));
	        $('#tiketsutd').text(selectedSeats.length);
	        $('#moneytd').text(seatPrice.toLocaleString());
	        $('#allmoneytd').text((selectedSeats.length * seatPrice).toLocaleString());
	    }

	    // 확인 버튼 클릭 시
	    $('#cheakHR2').click(function() {
	        updateSelectedSeats(); // 선택한 좌석 업데이트
	    });
	});
</script>

<body>
<div class="upnav">
<img src="../resources/images/로고.png">
<ul class="snip1143">
<h1>예매하기</h1>
</div>
</ul>
<form id="chocemenu" method="get" action="##">
<p>구간선택</p>
<div id="choce1">
	<div id="chocebutton">
<img src="../resources/images/가격별png.png">
<button type="button" id="A" value="A">A</button>
<button type="button" id="B" value="B">B</button>
<button type="button" id="R" value="R">R</button>
<button type="button" id="S" value="S">S</button>
<button type="button" id="F" value="F">F</button>
<button type="button" id="HR2" value="HR2">HR2</button>
<button type="button" id="HR" value="HR">HR</button>
</div>

<div id="Aall">
<h2 id="AH2">A</h2>
<div class="aclass">
<button type="button" class="Achar" id="A1" value="A1">1</button>
<button type="button" class="Achar" id="A2" value="A2">2</button>
<button type="button" class="Achar" id="A3" value="A3">3</button>
<button type="button" class="Achar" id="A4" value="A4">4</button>
<button type="button" class="Achar" id="A5" value="A5">5</button>
<button type="button" class="Achar" id="A6" value="A6">6</button>
<button type="button" class="Achar" id="A7" value="A7">7</button>
<button type="button" class="Achar" id="A8" value="A8">8</button>
<button type="button" class="Achar" id="A9" value="A9">9</button>
<button type="button" class="Achar" id="A10" value="A10">10</button>
	<br>
<button type="button" class="Achar" id="A11" value="A11">11</button>
<button type="button" class="Achar" id="A12" value="A12">12</button>
<button type="button" class="Achar" id="A13" value="A13">13</button>
<button type="button" class="Achar" id="A14" value="A14">14</button>
<button type="button" class="Achar" id="A15" value="A15">15</button>
<button type="button" class="Achar" id="A16" value="A16">16</button>
<button type="button" class="Achar" id="A17" value="A17">17</button>
<button type="button" class="Achar" id="A18" value="A18">18</button>
<button type="button" class="Achar" id="A19" value="A19">19</button>
<button type="button" class="Achar" id="A20" value="A20">20</button>
	<br>
<button type="button" class="Achar" id="A21" value="A21">21</button>
<button type="button" class="Achar" id="A22" value="A22">22</button>
<button type="button" class="Achar" id="A23" value="A23">23</button>
<button type="button" class="Achar" id="A24" value="A24">24</button>
<button type="button" class="Achar" id="A25" value="A25">25</button>
<button type="button" class="Achar" id="A26" value="A26">26</button>
<button type="button" class="Achar" id="A27" value="A27">27</button>
<button type="button" class="Achar" id="A28" value="A28">28</button>
<button type="button" class="Achar" id="A29" value="A29">29</button>
<button type="button" class="Achar" id="A30" value="A30">30</button>
	<br>
<button type="button" class="Achar" id="A31" value="A31">31</button>
<button type="button" class="Achar" id="A32" value="A32">32</button>
<button type="button" class="Achar" id="A33" value="A33">33</button>
<button type="button" class="Achar" id="A34" value="A34">34</button>
<button type="button" class="Achar" id="A35" value="A35">35</button>
<button type="button" class="Achar" id="A36" value="A36">36</button>
<button type="button" class="Achar" id="A37" value="A37">37</button>
<button type="button" class="Achar" id="A38" value="A38">38</button>
<button type="button" class="Achar" id="A39" value="A39">39</button>
<button type="button" class="Achar" id="A40" value="A40">40</button>
	<br>
<button type="button" class="Achar" id="A41" value="A41">41</button>
<button type="button" class="Achar" id="A42" value="A42">42</button>
<button type="button" class="Achar" id="A43" value="A43">43</button>
<button type="button" class="Achar" id="A44" value="A44">44</button>
<button type="button" class="Achar" id="A45" value="A45">45</button>
<button type="button" class="Achar" id="A46" value="A46">46</button>
<button type="button" class="Achar" id="A47" value="A47">47</button>
<button type="button" class="Achar" id="A48" value="A48">48</button>
<button type="button" class="Achar" id="A49" value="A49">49</button>
<button type="button" class="Achar" id="A50" value="A50">50</button>
	<br>
<button type="button" class="Achar" id="A51" value="A51">51</button>
<button type="button" class="Achar" id="A52" value="A52">52</button>
<button type="button" class="Achar" id="A53" value="A53">53</button>
<button type="button" class="Achar" id="A54" value="A54">54</button>
<button type="button" class="Achar" id="A55" value="A55">55</button>
<button type="button" class="Achar" id="A56" value="A56">56</button>
<button type="button" class="Achar" id="A57" value="A57">57</button>
<button type="button" class="Achar" id="A58" value="A58">58</button>
<button type="button" class="Achar" id="A59" value="A59">59</button>
<button type="button" class="Achar" id="A60" value="A60">60</button>
	<br>	
<button type="button" class="Achar" id="A61" value="A61">61</button>
<button type="button" class="Achar" id="A62" value="A62">62</button>
<button type="button" class="Achar" id="A63" value="A63">63</button>
<button type="button" class="Achar" id="A64" value="A64">64</button>
<button type="button" class="Achar" id="A65" value="A65">65</button>
<button type="button" class="Achar" id="A66" value="A66">66</button>
<button type="button" class="Achar" id="A67" value="A67">67</button>
<button type="button" class="Achar" id="A68" value="A68">68</button>
<button type="button" class="Achar" id="A69" value="A69">69</button>
<button type="button" class="Achar" id="A70" value="A70">70</button>
	<br>
<button type="button" class="Achar" id="A71" value="A71">71</button>
<button type="button" class="Achar" id="A72" value="A72">72</button>
<button type="button" class="Achar" id="A73" value="A73">73</button>
<button type="button" class="Achar" id="A74" value="A74">74</button>
<button type="button" class="Achar" id="A75" value="A75">75</button>
<button type="button" class="Achar" id="A76" value="A76">76</button>
<button type="button" class="Achar" id="A77" value="A77">77</button>
<button type="button" class="Achar" id="A78" value="A78">78</button>
<button type="button" class="Achar" id="A79" value="A79">79</button>
<button type="button" class="Achar" id="A80" value="A80">80</button>
	<br>
<button type="button" class="Achar" id="A81" value="A81">81</button>
<button type="button" class="Achar" id="A82" value="A82">82</button>
<button type="button" class="Achar" id="A83" value="A83">83</button>
<button type="button" class="Achar" id="A84" value="A84">84</button>
<button type="button" class="Achar" id="A85" value="A85">85</button>
<button type="button" class="Achar" id="A86" value="A86">86</button>
<button type="button" class="Achar" id="A87" value="A87">87</button>
<button type="button" class="Achar" id="A88" value="A88">88</button>
<button type="button" class="Achar" id="A89" value="A89">89</button>
<button type="button" class="Achar" id="A90" value="A90">90</button>
	<br>
<button type="button" class="Achar" id="A91" value="A91">91</button>
<button type="button" class="Achar" id="A92" value="A92">92</button>
<button type="button" class="Achar" id="A93" value="A93">93</button>
<button type="button" class="Achar" id="A94" value="A94">94</button>
<button type="button" class="Achar" id="A95" value="A95">95</button>
<button type="button" class="Achar" id="A96" value="A96">96</button>
<button type="button" class="Achar" id="A97" value="A97">97</button>
<button type="button" class="Achar" id="A98" value="A98">98</button>
<button type="button" class="Achar" id="A99" value="A99">99</button>
<button type="button" class="Achar" id="A100" value="A100">100</button>	
</div>
<button type="button" id="backA">이전페이지</button>
<button type="button" id="cheakA">확인</button>
</div>

<div id="Ball">
<h2 id="BH2">B</h2>
<div class="bclass">
<button type="button" class="Bchar" id="B1" value="B1">1</button>
<button type="button" class="Bchar" id="B2" value="B2">2</button>
<button type="button" class="Bchar" id="B3" value="B3">3</button>
<button type="button" class="Bchar" id="B4" value="B4">4</button>
<button type="button" class="Bchar" id="B5" value="B5">5</button>
<button type="button" class="Bchar" id="B6" value="B6">6</button>
<button type="button" class="Bchar" id="B7" value="B7">7</button>
<button type="button" class="Bchar" id="B8" value="B8">8</button>
<button type="button" class="Bchar" id="B9" value="B9">9</button>
<button type="button" class="Bchar" id="B10" value="B10">10</button>
	<br>
<button type="button" class="Bchar" id="B11" value="B11">11</button>
<button type="button" class="Bchar" id="B12" value="B12">12</button>
<button type="button" class="Bchar" id="B13" value="B13">13</button>
<button type="button" class="Bchar" id="B14" value="B14">14</button>
<button type="button" class="Bchar" id="B15" value="B15">15</button>
<button type="button" class="Bchar" id="B16" value="B16">16</button>
<button type="button" class="Bchar" id="B17" value="B17">17</button>
<button type="button" class="Bchar" id="B18" value="B18">18</button>
<button type="button" class="Bchar" id="B19" value="B19">19</button>
<button type="button" class="Bchar" id="B20" value="B20">20</button>
	<br>
<button type="button" class="Bchar" id="B21" value="B21">21</button>
<button type="button" class="Bchar" id="B22" value="B22">22</button>
<button type="button" class="Bchar" id="B23" value="B23">23</button>
<button type="button" class="Bchar" id="B24" value="B24">24</button>
<button type="button" class="Bchar" id="B25" value="B25">25</button>
<button type="button" class="Bchar" id="B26" value="B26">26</button>
<button type="button" class="Bchar" id="B27" value="B27">27</button>
<button type="button" class="Bchar" id="B28" value="B28">28</button>
<button type="button" class="Bchar" id="B29" value="B29">29</button>
<button type="button" class="Bchar" id="B30" value="B30">30</button>
	<br>
<button type="button" class="Bchar" id="B31" value="B31">31</button>
<button type="button" class="Bchar" id="B32" value="B32">32</button>
<button type="button" class="Bchar" id="B33" value="B33">33</button>
<button type="button" class="Bchar" id="B34" value="B34">34</button>
<button type="button" class="Bchar" id="B35" value="B35">35</button>
<button type="button" class="Bchar" id="B36" value="36">36</button>
<button type="button" class="Bchar" id="B37" value="BA37">37</button>
<button type="button" class="Bchar" id="B38" value="B38">38</button>
<button type="button" class="Bchar" id="B39" value="B39">39</button>
<button type="button" class="Bchar" id="B40" value="B40">40</button>
	<br>
<button type="button" class="Bchar" id="B41" value="B41">41</button>
<button type="button" class="Bchar" id="B42" value="B42">42</button>
<button type="button" class="Bchar" id="B43" value="B43">43</button>
<button type="button" class="Bchar" id="B44" value="B44">44</button>
<button type="button" class="Bchar" id="B45" value="B45">45</button>
<button type="button" class="Bchar" id="B46" value="B46">46</button>
<button type="button" class="Bchar" id="B47" value="B47">47</button>
<button type="button" class="Bchar" id="B48" value="B48">48</button>
<button type="button" class="Bchar" id="B49" value="B49">49</button>
<button type="button" class="Bchar" id="B50" value="B50">50</button>
	<br>
<button type="button" class="Bchar" id="B51" value="B51">51</button>
<button type="button" class="Bchar" id="B52" value="B52">52</button>
<button type="button" class="Bchar" id="B53" value="B53">53</button>
<button type="button" class="Bchar" id="B54" value="B54">54</button>
<button type="button" class="Bchar" id="B55" value="B55">55</button>
<button type="button" class="Bchar" id="B56" value="B56">56</button>
<button type="button" class="Bchar" id="B57" value="B57">57</button>
<button type="button" class="Bchar" id="B58" value="B58">58</button>
<button type="button" class="Bchar" id="B59" value="B59">59</button>
<button type="button" class="Bchar" id="B60" value="B60">60</button>
	<br>
<button type="button" class="Bchar" id="B61" value="B61">61</button>
<button type="button" class="Bchar" id="B62" value="B62">62</button>
<button type="button" class="Bchar" id="B63" value="B63">63</button>
<button type="button" class="Bchar" id="B64" value="B64">64</button>
<button type="button" class="Bchar" id="B65" value="B65">65</button>
<button type="button" class="Bchar" id="B66" value="B66">66</button>
<button type="button" class="Bchar" id="B67" value="B67">67</button>
<button type="button" class="Bchar" id="B68" value="B68">68</button>
<button type="button" class="Bchar" id="B69" value="B69">69</button>
<button type="button" class="Bchar" id="B70" value="B70">70</button>
	<br>
<button type="button" class="Bchar" id="B71" value="B71">71</button>
<button type="button" class="Bchar" id="B72" value="B72">72</button>
<button type="button" class="Bchar" id="B73" value="B73">73</button>
<button type="button" class="Bchar" id="B74" value="B74">74</button>
<button type="button" class="Bchar" id="B75" value="B75">75</button>
<button type="button" class="Bchar" id="B76" value="B76">76</button>
<button type="button" class="Bchar" id="B77" value="B77">77</button>
<button type="button" class="Bchar" id="B78" value="B78">78</button>
<button type="button" class="Bchar" id="B79" value="B79">79</button>
<button type="button" class="Bchar" id="B80" value="B80">80</button>
	<br>
<button type="button" class="Bchar" id="B81" value="B81">81</button>
<button type="button" class="Bchar" id="B82" value="B82">82</button>
<button type="button" class="Bchar" id="B83" value="B83">83</button>
<button type="button" class="Bchar" id="B84" value="B84">84</button>
<button type="button" class="Bchar" id="B85" value="B85">85</button>
<button type="button" class="Bchar" id="B86" value="B86">86</button>
<button type="button" class="Bchar" id="B87" value="BA87">87</button>
<button type="button" class="Bchar" id="B88" value="B88">88</button>
<button type="button" class="Bchar" id="B89" value="B89">89</button>
<button type="button" class="Bchar" id="B90" value="B90">90</button>
	<br>
<button type="button" class="Bchar" id="B91" value="B91">91</button>
<button type="button" class="Bchar" id="B92" value="B92">92</button>
<button type="button" class="Bchar" id="B93" value="B93">93</button>
<button type="button" class="Bchar" id="B94" value="B94">94</button>
<button type="button" class="Bchar" id="B95" value="B95">95</button>
<button type="button" class="Bchar" id="B96" value="B96">96</button>
<button type="button" class="Bchar" id="B97" value="B97">97</button>
<button type="button" class="Bchar" id="B98" value="B98">98</button>
<button type="button" class="Bchar" id="B99" value="B99">99</button>
<button type="button" class="Bchar" id="B100" value="B100">100</button>	
	</div>
<button type="button" id="backB">이전페이지</button>
<button type="button" id="cheakB">확인</button>
</div>	
	
<div id="Rall">
<h2 id="RH2">R</h2>
<div class="Rclass">
<button type="button" class="Rchar" id="R1" value="R1">1</button>
<button type="button" class="Rchar" id="R2" value="R2">2</button>
<button type="button" class="Rchar" id="R3" value="R3">3</button>
<button type="button" class="Rchar" id="R4" value="R4">4</button>
<button type="button" class="Rchar" id="R5" value="R5">5</button>
<button type="button" class="Rchar" id="R6" value="R6">6</button>
<button type="button" class="Rchar" id="R7" value="R7">7</button>
<button type="button" class="Rchar" id="R8" value="R8">8</button>
<button type="button" class="Rchar" id="R9" value="R9">9</button>
<button type="button" class="Rchar" id="R10" value="R10">10</button>
	<br>
<button type="button" class="Rchar" id="R11" value="R11">11</button>
<button type="button" class="Rchar" id="R12" value="R12">12</button>
<button type="button" class="Rchar" id="R13" value="R13">13</button>
<button type="button" class="Rchar" id="R14" value="R14">14</button>
<button type="button" class="Rchar" id="R15" value="R15">15</button>
<button type="button" class="Rchar" id="R16" value="R16">16</button>
<button type="button" class="Rchar" id="R17" value="R17">17</button>
<button type="button" class="Rchar" id="R18" value="R18">18</button>
<button type="button" class="Rchar" id="R19" value="R19">19</button>
<button type="button" class="Rchar" id="R20" value="R20">20</button>
	<br>
<button type="button" class="Rchar" id="R21" value="R21">21</button>
<button type="button" class="Rchar" id="R22" value="R22">22</button>
<button type="button" class="Rchar" id="R23" value="R23">23</button>
<button type="button" class="Rchar" id="R24" value="R24">24</button>
<button type="button" class="Rchar" id="R25" value="R25">25</button>
<button type="button" class="Rchar" id="R26" value="R26">26</button>
<button type="button" class="Rchar" id="R27" value="R27">27</button>
<button type="button" class="Rchar" id="R28" value="R28">28</button>
<button type="button" class="Rchar" id="R29" value="R29">29</button>
<button type="button" class="Rchar" id="R30" value="R30">30</button>
	<br>
<button type="button" class="Rchar" id="R31" value="R31">31</button>
<button type="button" class="Rchar" id="R32" value="R32">32</button>
<button type="button" class="Rchar" id="R33" value="R33">33</button>
<button type="button" class="Rchar" id="R34" value="R34">34</button>
<button type="button" class="Rchar" id="R35" value="R35">35</button>
<button type="button" class="Rchar" id="R36" value="R36">36</button>
<button type="button" class="Rchar" id="R37" value="R37">37</button>
<button type="button" class="Rchar" id="R38" value="R38">38</button>
<button type="button" class="Rchar" id="R39" value="R39">39</button>
<button type="button" class="Rchar" id="R40" value="R40">40</button>
	<br>
<button type="button" class="Rchar" id="R41" value="R41">41</button>
<button type="button" class="Rchar" id="R42" value="R42">42</button>
<button type="button" class="Rchar" id="R43" value="R43">43</button>
<button type="button" class="Rchar" id="R44" value="R44">44</button>
<button type="button" class="Rchar" id="R45" value="R45">45</button>
<button type="button" class="Rchar" id="R46" value="R46">46</button>
<button type="button" class="Rchar" id="R47" value="R47">47</button>
<button type="button" class="Rchar" id="R48" value="R48">48</button>
<button type="button" class="Rchar" id="R49" value="R49">49</button>
<button type="button" class="Rchar" id="R50" value="R50">50</button>
	</div>
<button type="button" id="backR">이전페이지</button>
<button type="button" id="cheakR">확인</button>
</div>	
	
<div id="Fall">
<h2 id="FH2">F</h2>
<div class="Fclass">
<button type="button" class="Fchar" id="F1" value="F1">1</button>
<button type="button" class="Fchar" id="F2" value="F2">2</button>
<button type="button" class="Fchar" id="F3" value="F3">3</button>
<button type="button" class="Fchar" id="F4" value="F4">4</button>
<button type="button" class="Fchar" id="F5" value="F5">5</button>
<button type="button" class="Fchar" id="F6" value="F6">6</button>
<button type="button" class="Fchar" id="F7" value="F7">7</button>
<button type="button" class="Fchar" id="F8" value="F8">8</button>
<button type="button" class="Fchar" id="F9" value="F9">9</button>
<button type="button" class="Fchar" id="F10" value="F10">10</button>
	<br>
<button type="button" class="Fchar" id="F11" value="F11">11</button>
<button type="button" class="Fchar" id="F12" value="F12">12</button>
<button type="button" class="Fchar" id="F13" value="F13">13</button>
<button type="button" class="Fchar" id="F14" value="F14">14</button>
<button type="button" class="Fchar" id="F15" value="F15">15</button>
<button type="button" class="Fchar" id="F16" value="F16">16</button>
<button type="button" class="Fchar" id="F17" value="F17">17</button>
<button type="button" class="Fchar" id="F18" value="F18">18</button>
<button type="button" class="Fchar" id="F19" value="F19">19</button>
<button type="button" class="Fchar" id="F20" value="F20">20</button>
	<br>
<button type="button" class="Fchar" id="F21" value="F21">21</button>
<button type="button" class="Fchar" id="F22" value="F22">22</button>
<button type="button" class="Fchar" id="F23" value="F23">23</button>
<button type="button" class="Fchar" id="F24" value="F24">24</button>
<button type="button" class="Fchar" id="F25" value="F25">25</button>
<button type="button" class="Fchar" id="F26" value="F26">26</button>
<button type="button" class="Fchar" id="F27" value="F27">27</button>
<button type="button" class="Fchar" id="F28" value="F28">28</button>
<button type="button" class="Fchar" id="F29" value="F29">29</button>
<button type="button" class="Fchar" id="F30" value="F30">30</button>
	<br>
<button type="button" class="Fchar" id="F31" value="F31">31</button>
<button type="button" class="Fchar" id="F32" value="F32">32</button>
<button type="button" class="Fchar" id="F33" value="F33">33</button>
<button type="button" class="Fchar" id="F34" value="F34">34</button>
<button type="button" class="Fchar" id="F35" value="F35">35</button>
<button type="button" class="Fchar" id="F36" value="F36">36</button>
<button type="button" class="Fchar" id="F37" value="F37">37</button>
<button type="button" class="Fchar" id="F38" value="F38">38</button>
<button type="button" class="Fchar" id="F39" value="F39">39</button>
<button type="button" class="Fchar" id="F40" value="F40">40</button>
	<br>
<button type="button" class="Fchar" id="F41" value="F41">41</button>
<button type="button" class="Fchar" id="F42" value="F42">42</button>
<button type="button" class="Fchar" id="F43" value="F43">43</button>
<button type="button" class="Fchar" id="F44" value="F44">44</button>
<button type="button" class="Fchar" id="F45" value="F45">45</button>
<button type="button" class="Fchar" id="F46" value="F46">46</button>
<button type="button" class="Fchar" id="F47" value="F47">47</button>
<button type="button" class="Fchar" id="F48" value="F48">48</button>
<button type="button" class="Fchar" id="F49" value="F49">49</button>
<button type="button" class="Fchar" id="F50" value="F50">50</button>
	</div>
<button type="button" id="backF">이전페이지</button>
<button type="button" id="cheakF">확인</button>
</div>		
	

<div id="HRall">
<h2 id="HRH2">HR</h2>
<div class="HRclass">
<button type="button" class="HRchar" id="HR1" value="HR1">1</button>
<button type="button" class="HRchar" id="Hr2" value="HR2">2</button>
<button type="button" class="HRchar" id="HR3" value="HR3">3</button>
<button type="button" class="HRchar" id="HR4" value="HR4">4</button>
<button type="button" class="HRchar" id="HR5" value="HR5">5</button>
<button type="button" class="HRchar" id="HR6" value="HR6">6</button>
<button type="button" class="HRchar" id="HR7" value="HR7">7</button>
<button type="button" class="HRchar" id="HR8" value="HR8">8</button>
<button type="button" class="HRchar" id="HR9" value="HR9">9</button>
<button type="button" class="HRchar" id="HR10" value="HR10">10</button>
	<br>
<button type="button" class="HRchar" id="HR11" value="HR11">11</button>
<button type="button" class="HRchar" id="HR12" value="HR12">12</button>
<button type="button" class="HRchar" id="HR13" value="HR13">13</button>
<button type="button" class="HRchar" id="HR14" value="HR14">14</button>
<button type="button" class="HRchar" id="HR15" value="HR15">15</button>
<button type="button" class="HRchar" id="HR16" value="HR16">16</button>
<button type="button" class="HRchar" id="HR17" value="HR17">17</button>
<button type="button" class="HRchar" id="HR18" value="HR18">18</button>
<button type="button" class="HRchar" id="HR19" value="HR19">19</button>
<button type="button" class="HRchar" id="HR20" value="HR20">20</button>
	<br>
<button type="button" class="HRchar" id="HR21" value="HR21">21</button>
<button type="button" class="HRchar" id="HR22" value="HR22">22</button>
<button type="button" class="HRchar" id="HR23" value="HR23">23</button>
<button type="button" class="HRchar" id="HR24" value="HR24">24</button>
<button type="button" class="HRchar" id="HR25" value="HR25">25</button>
<button type="button" class="HRchar" id="HR26" value="HR26">26</button>
<button type="button" class="HRchar" id="HR27" value="HR27">27</button>
<button type="button" class="HRchar" id="HR28" value="HR28">28</button>
<button type="button" class="HRchar" id="HR29" value="HR29">29</button>
<button type="button" class="HRchar" id="HR30" value="HR30">30</button>
	<br>
<button type="button" class="HRchar" id="HR31" value="HR31">31</button>
<button type="button" class="HRchar" id="HR32" value="HR32">32</button>
<button type="button" class="HRchar" id="HR33" value="HR33">33</button>
<button type="button" class="HRchar" id="HR34" value="HR34">34</button>
<button type="button" class="HRchar" id="HR35" value="HR35">35</button>
<button type="button" class="HRchar" id="HR36" value="HR36">36</button>
<button type="button" class="HRchar" id="HR37" value="HR37">37</button>
<button type="button" class="HRchar" id="HR38" value="HR38">38</button>
<button type="button" class="HRchar" id="HR39" value="HR39">39</button>
<button type="button" class="HRchar" id="HR40" value="HR40">40</button>
	<br>
<button type="button" class="HRchar" id="HR41" value="HR41">41</button>
<button type="button" class="HRchar" id="HR42" value="HR42">42</button>
<button type="button" class="HRchar" id="HR43" value="HR43">43</button>
<button type="button" class="HRchar" id="HR44" value="HR44">44</button>
<button type="button" class="HRchar" id="HR45" value="HR45">45</button>
<button type="button" class="HRchar" id="HR46" value="HR46">46</button>
<button type="button" class="HRchar" id="HR47" value="HR47">47</button>
<button type="button" class="HRchar" id="HR48" value="HR48">48</button>
<button type="button" class="HRchar" id="HR49" value="HR49">49</button>
<button type="button" class="HRchar" id="HR50" value="HR50">50</button>
	<br>
<button type="button" class="HRchar" id="HR51" value="HR51">51</button>
<button type="button" class="HRchar" id="HR52" value="HR52">52</button>
<button type="button" class="HRchar" id="HR53" value="HR53">53</button>
<button type="button" class="HRchar" id="HR54" value="HR54">54</button>
<button type="button" class="HRchar" id="HR55" value="HR55">55</button>
<button type="button" class="HRchar" id="HR56" value="HR56">56</button>
<button type="button" class="HRchar" id="HR57" value="HR57">57</button>
<button type="button" class="HRchar" id="HR58" value="HR58">58</button>
<button type="button" class="HRchar" id="HR59" value="HR59">59</button>
<button type="button" class="HRchar" id="HR60" value="HR60">60</button>
	<br>
<button type="button" class="HRchar" id="HR61" value="HR61">61</button>
<button type="button" class="HRchar" id="HR62" value="HR62">62</button>
<button type="button" class="HRchar" id="HR63" value="HR63">63</button>
<button type="button" class="HRchar" id="HR64" value="HR64">64</button>
<button type="button" class="HRchar" id="HR65" value="HR65">65</button>
<button type="button" class="HRchar" id="HR66" value="HR66">66</button>
<button type="button" class="HRchar" id="HR67" value="HR67">67</button>
<button type="button" class="HRchar" id="HR68" value="HR68">68</button>
<button type="button" class="HRchar" id="HR69" value="HR69">69</button>
<button type="button" class="HRchar" id="HR70" value="HR70">70</button>
	<br>
<button type="button" class="HRchar" id="HR71" value="HR71">71</button>
<button type="button" class="HRchar" id="HR72" value="HR72">72</button>
<button type="button" class="HRchar" id="HR73" value="HR73">73</button>
<button type="button" class="HRchar" id="HR74" value="HR74">74</button>
<button type="button" class="HRchar" id="HR75" value="HR75">75</button>
	</div>
<button type="button" id="backHR">이전페이지</button>
<button type="button" id="cheakHR">확인</button>
</div>			

<div id="HR2-all">
<h2 id="HR2-H2">HR2</h2>
<div class="HR2-class">
<button type="button" class="HR2-char" id="HR2-1" value="HR2-1">1</button>
<button type="button" class="HR2-char" id="HR2-2" value="HR2-2">2</button>
<button type="button" class="HR2-char" id="HR2-3" value="HR2-3">3</button>
<button type="button" class="HR2-char" id="HR2-4" value="HR2-4">4</button>
<button type="button" class="HR2-char" id="HR2-5" value="HR2-5">5</button>
<button type="button" class="HR2-char" id="HR2-6" value="HR2-6">6</button>
<button type="button" class="HR2-char" id="HR2-7" value="HR2-7">7</button>
<button type="button" class="HR2-char" id="HR2-8" value="HR2-8">8</button>
<button type="button" class="HR2-char" id="HR2-9" value="HR2-9">9</button>
<button type="button" class="HR2-char" id="HR2-10" value="HR2-10">10</button>
	<br>
<button type="button" class="HR2-char" id="HR2-11" value="HR2-11">11</button>
<button type="button" class="HR2-char" id="HR2-12" value="HR2-12">12</button>
<button type="button" class="HR2-char" id="HR2-13" value="HR2-13">13</button>
<button type="button" class="HR2-char" id="HR2-14" value="HR2-14">14</button>
<button type="button" class="HR2-char" id="HR2-15" value="HR2-15">15</button>
<button type="button" class="HR2-char" id="HR2-16" value="HR2-16">16</button>
<button type="button" class="HR2-char" id="HR2-17" value="HR2-17">17</button>
<button type="button" class="HR2-char" id="HR2-18" value="HR2-18">18</button>
<button type="button" class="HR2-char" id="HR2-19" value="HR2-19">19</button>
<button type="button" class="HR2-char" id="HR2-20" value="HR2-20">20</button>
	<br>
<button type="button" class="HR2-char" id="HR2-21" value="HR2-21">21</button>
<button type="button" class="HR2-char" id="HR2-22" value="HR2-22">22</button>
<button type="button" class="HR2-char" id="HR2-23" value="HR2-23">23</button>
<button type="button" class="HR2-char" id="HR2-24" value="HR2-24">24</button>
<button type="button" class="HR2-char" id="HR2-25" value="HR2-25">25</button>	
	</div>
<button type="button" id="backHR2">이전페이지</button>
<button type="button" id="cheakHR2">확인</button>
</div>	
	
<div id="Sall">
<h2 id="SH2">S</h2>
<div class="Sclass">
<button type="button" class="Schar" id="S1" value="S1">1</button>
<button type="button" class="Schar" id="S2" value="S2">2</button>
<button type="button" class="Schar" id="S3" value="S3">3</button>
<button type="button" class="Schar" id="S4" value="S4">4</button>
<button type="button" class="Schar" id="S5" value="S5">5</button>
<button type="button" class="Schar" id="S6" value="S6">6</button>
<button type="button" class="Schar" id="S7" value="S7">7</button>
<button type="button" class="Schar" id="S8" value="S8">8</button>
<button type="button" class="Schar" id="S9" value="S9">9</button>
<button type="button" class="Schar" id="S10" value="S10">10</button>
	<br>
<button type="button" class="Schar" id="S11" value="S11">11</button>
<button type="button" class="Schar" id="S12" value="S12">12</button>
<button type="button" class="Schar" id="S13" value="S13">13</button>
<button type="button" class="Schar" id="S14" value="S14">14</button>
<button type="button" class="Schar" id="S15" value="S15">15</button>
<button type="button" class="Schar" id="S16" value="S16">16</button>
<button type="button" class="Schar" id="S17" value="S17">17</button>
<button type="button" class="Schar" id="S18" value="S18">18</button>
<button type="button" class="Schar" id="S19" value="S19">19</button>
<button type="button" class="Schar" id="S20" value="S20">20</button>	
</div>
<button type="button" id="backS">이전페이지</button>
<button type="button" id="cheakS">확인</button>
</div>		
	

<div id="allsum">
<img src="../resources/images/티켓안내.png">	
<table>
<tr>
<th id="site">구간</th>
	<th id="charnum">좌석번호</th>
	<th id="tiketsu">수량</th>
	<th id="money">금액</th>
	<th id="allmoney">총금액</th>
</tr>
	<tr id="downtr">
	<td id="sitetd"></td>
	<td id="charnumtd">21</td>
	<td id="tiketsutd">2</td>
	<td id="moneytd">10,000</td>
	<td id="allmoneytd">20,000</td>
	</tr>
</table>
	<div id="button12">
    <div id="pay1"><input type="submit" id="pay" value="결제하기"></div> 
	<div id="main1"><button type="button" onclick="location.href='예매.jsp'" id="main">취소하기</button></div>
	</div>
</div>	

	
</div>
</form>

		
</body>
</html>
