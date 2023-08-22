<%@page import="kr.or.ddit.middle.vo.LoginVO"%>
<%@page import="kr.or.ddit.middle.vo.TicketVO"%>
<%@page import="kr.or.ddit.middle.vo.MatchVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>예매상세</title>
<link rel="stylesheet"
   href="<%=request.getContextPath() %>/resources/css/예매상세.css">
<link rel="stylesheet"
   href="<%=request.getContextPath() %>/resources/css/예매.css">
<link rel="shortcut icon"
   href="<%=request.getContextPath() %>/resources/images/미니.png">
<script type="text/javascript"
   src="<%=request.getContextPath() %>/resources/js/jquery-3.7.0.min.js"></script>
<!-- jQuery -->
<script type="text/javascript"
   src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<!-- iamport.payment.js -->
<script type="text/javascript"
   src="https://cdn.iamport.kr/js/iamport.payment-1.2.0.js"></script>
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
/* changeColor = function(){
   this.style.background ='darkred';
}
changeColor2 = function(){
   this.style.background ='darkblue';
}
 */
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
   
//    $(function(){
//       $('.nexttiket').on("click", function(){
//          $('#fristui').hide();
//          $('#chocebutton').show();
         
//          console.log($(this).parents().find("tr"));
//       });
//    });
   

   $(function(){
      $("#tBody").on("click", "button", function(){
         var length = $(this).parents();
         $(this).parents().each(function(i, v){
            if(v.localName == "tr"){
               console.log(i + " :::  " + v);
               console.log(v.children[0].children[0].innerText.trim());
               console.log(v.children[1].children[5].innerText.trim());
               
               
                $("#fimDate").val(v.children[0].children[0].innerText.trim()); 
               
               $("#fiawayTeam").val(v.children[1].children[5].innerText.trim()); 
               
                var matchDate =v.children[0].children[0].innerText.trim();
   
               
                $.ajax({
                  url: '/MiddleProject/matchDateTicket.do',
                  type : 'GET',
                  data : {"matchDate" : matchDate},
                  success : function(res){
                     
                  var responseDate = res;   
                     alert(responseDate);
                  $('#matchDateResult').val(responseDate);   

                  },
                  error : function(xhr){
                  },
                  dataType : 'json'
               });  
            }
         });
      });
      
       $('.nexttiket').click(function(){
          if($("#fristui").css("display") != "none"){
               $('#fristui').hide();
          }
       });       
       
       $('.nexttiket').click(function(){
          if($("#chocebutton").css("display") == "none"){
               $('#chocebutton').show();
          }
       });
       
       $('.nexttiket').click(function(){         
          if($("#choce1").css("display") == "none"){
              $('#choce1').show();
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
              
              if( $(this).hasClass('active')){
                 
                 $(this).css('background', 'darkred')
               }else {
                 
                  $(this).removeAttr('style');
                 
               }
              updateSelectedSeats(); // 선택된 좌석 업데이트
          });
       

       // 선택된 좌석 업데이트
       function updateSelectedSeats() {
           selectedSeats = []; // 선택한 좌석 배열 초기화
           $('.Achar.active').each(function() {
               selectedSeats.push($(this).text()); // 선택한 좌석 번호 추가
           });
           
           $('#sitetd').text(selectedSite.toLocaleString());
          siteted = $('#sitetd').text(); 
          
           $('#charnumtd').text(selectedSeats.join(', '));
           charnumtd = $('#charnumtd').text();
           
           $('#tiketsutd').text(selectedSeats.length);
           tiketsutd = $('#tiketsutd').text();
           
           $('#moneytd').text(seatPrice.toLocaleString());
           moneytd = $('#moneytd').text();
           
           $('#allmoneytd').text((selectedSeats.length * seatPrice).toLocaleString());
           allmoneytd = $('#allmoneytd').text();

       }

       // 확인 버튼 클릭 시
       $('#cheakA').click(function() {
           updateSelectedSeats(); // 선택한 좌석 업데이트
       });
       
       // 결제하기 버튼 클릭 시
         $('#pay').on('click',function(){
          const time = Date.now();
          
         $("#fisiteted").val(siteted);
         $("#ficharnumtd").val(charnumtd);
         $("#fitiketsutd").val(tiketsutd);
         $("#fimoneytd").val(moneytd);
         $("#fiallmoneytd").val(allmoneytd);
           
           IMP.init('imp26845875');//아임포트 관리자 콘솔에서 확인한 '가맹점 식별코드' 입력
           IMP.request_pay({// param
               pg: "kakaopay.TC0ONETIME", //pg사명 or pg사명.CID (잘못 입력할 경우, 기본 PG사가 띄워짐)
               pay_method: "card", //지불 방법
               merchant_uid: time, //가맹점 주문번호 (아임포트를 사용하는 가맹점에서 중복되지 않은 임의의 문자열을 입력)
                                          //티켓번호 넣으면 댐
               
               name: "티켓예매", //결제창에 노출될 상품명
               amount: allmoneytd //금액
        //       buyer_email : "drc0729@naver.com", 
        //       buyer_name : "이건창",
        //       buyer_tel : "01056829550"
               
              
               
           }, function (rsp) { // callback
               if (rsp.success) {
                   alert("티켓 결제 완료되었습니다");
                  $("#fiForm").submit();
                  
               } else {
                   alert("티켓 결제가 취소되었습니다");
               }
           });
           
          

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
              
              if( $(this).hasClass('active')){
                 
                 $(this).css('background', 'darkred')
               }else {
                 
                  $(this).removeAttr('style');
                 
               }
              updateSelectedSeats(); // 선택된 좌석 업데이트
          });

       // 선택된 좌석 업데이트
       function updateSelectedSeats() {
           selectedSeats = []; // 선택한 좌석 배열 초기화
           $('.Bchar.active').each(function() {
               selectedSeats.push($(this).text()); // 선택한 좌석 번호 추가
           });
           
           $('#sitetd').text(selectedSite.toLocaleString());
          siteted = $('#sitetd').text(); 
          
           $('#charnumtd').text(selectedSeats.join(', '));
           charnumtd = $('#charnumtd').text();
           
           $('#tiketsutd').text(selectedSeats.length);
           tiketsutd = $('#tiketsutd').text();
           
           $('#moneytd').text(seatPrice.toLocaleString());
           moneytd = $('#moneytd').text();
           
           $('#allmoneytd').text((selectedSeats.length * seatPrice).toLocaleString());
           allmoneytd = $('#allmoneytd').text();

       }

       // 확인 버튼 클릭 시
       $('#cheakB').click(function() {
           updateSelectedSeats(); // 선택한 좌석 업데이트
       });
       
       // 결제하기 버튼 클릭 시
         $('#pay').on('click',function(){
          const time = Date.now();
          
         $("#fisiteted").val(siteted);
         $("#ficharnumtd").val(charnumtd);
         $("#fitiketsutd").val(tiketsutd);
         $("#fimoneytd").val(moneytd);
         $("#fiallmoneytd").val(allmoneytd);
           
           IMP.init('imp26845875');//아임포트 관리자 콘솔에서 확인한 '가맹점 식별코드' 입력
           IMP.request_pay({// param
               pg: "kakaopay.TC0ONETIME", //pg사명 or pg사명.CID (잘못 입력할 경우, 기본 PG사가 띄워짐)
               pay_method: "card", //지불 방법
               merchant_uid: time, //가맹점 주문번호 (아임포트를 사용하는 가맹점에서 중복되지 않은 임의의 문자열을 입력)
                                          //티켓번호 넣으면 댐
               
               name: "티켓예매", //결제창에 노출될 상품명
               amount: allmoneytd //금액
        //       buyer_email : "drc0729@naver.com", 
        //       buyer_name : "이건창",
        //       buyer_tel : "01056829550"
               
              
               
           }, function (rsp) { // callback
               if (rsp.success) {
                   alert("티켓 결제 완료되었습니다");
                  $("#fiForm").submit();
                  
               } else {
                   alert("티켓 결제가 취소되었습니다");
               }
           });
           
          

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
              
              if( $(this).hasClass('active')){
                 
                 $(this).css('background', 'darkred')
               }else {
                 
                  $(this).removeAttr('style');
                 
               }
              updateSelectedSeats(); // 선택된 좌석 업데이트
          });

       // 선택된 좌석 업데이트
       function updateSelectedSeats() {
           selectedSeats = []; // 선택한 좌석 배열 초기화
           $('.Fchar.active').each(function() {
               selectedSeats.push($(this).text()); // 선택한 좌석 번호 추가
           });
           
           $('#sitetd').text(selectedSite.toLocaleString());
          siteted = $('#sitetd').text(); 
          
           $('#charnumtd').text(selectedSeats.join(', '));
           charnumtd = $('#charnumtd').text();
           
           $('#tiketsutd').text(selectedSeats.length);
           tiketsutd = $('#tiketsutd').text();
           
           $('#moneytd').text(seatPrice.toLocaleString());
           moneytd = $('#moneytd').text();
           
           $('#allmoneytd').text((selectedSeats.length * seatPrice).toLocaleString());
           allmoneytd = $('#allmoneytd').text();

       }

       // 확인 버튼 클릭 시
       $('#cheakF').click(function() {
           updateSelectedSeats(); // 선택한 좌석 업데이트
       });
       
       // 결제하기 버튼 클릭 시
       $('#pay').on('click',function(){
          const time = Date.now();
          
         $("#fisiteted").val(siteted);
         $("#ficharnumtd").val(charnumtd);
         $("#fitiketsutd").val(tiketsutd);
         $("#fimoneytd").val(moneytd);
         $("#fiallmoneytd").val(allmoneytd);
           
           IMP.init('imp26845875');//아임포트 관리자 콘솔에서 확인한 '가맹점 식별코드' 입력
           IMP.request_pay({// param
               pg: "kakaopay.TC0ONETIME", //pg사명 or pg사명.CID (잘못 입력할 경우, 기본 PG사가 띄워짐)
               pay_method: "card", //지불 방법
               merchant_uid: time, //가맹점 주문번호 (아임포트를 사용하는 가맹점에서 중복되지 않은 임의의 문자열을 입력)
                                          //티켓번호 넣으면 댐
               
               name: "티켓예매", //결제창에 노출될 상품명
               amount: allmoneytd //금액
        //       buyer_email : "drc0729@naver.com", 
        //       buyer_name : "이건창",
        //       buyer_tel : "01056829550"
               
              
               
           }, function (rsp) { // callback
               if (rsp.success) {
                   alert("티켓 결제 완료되었습니다");
                  $("#fiForm").submit();
                  
               } else {
                   alert("티켓 결제가 취소되었습니다");
               }
           });
           
          

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
              
              if( $(this).hasClass('active')){
                 
                 $(this).css('background', 'darkred')
               }else {
                 
                  $(this).removeAttr('style');
                 
               }
              updateSelectedSeats(); // 선택된 좌석 업데이트
          });

       // 선택된 좌석 업데이트
       function updateSelectedSeats() {
           selectedSeats = []; // 선택한 좌석 배열 초기화
           $('.Rchar.active').each(function() {
               selectedSeats.push($(this).text()); // 선택한 좌석 번호 추가
           });
           
           $('#sitetd').text(selectedSite.toLocaleString());
          siteted = $('#sitetd').text(); 
          
           $('#charnumtd').text(selectedSeats.join(', '));
           charnumtd = $('#charnumtd').text();
           
           $('#tiketsutd').text(selectedSeats.length);
           tiketsutd = $('#tiketsutd').text();
           
           $('#moneytd').text(seatPrice.toLocaleString());
           moneytd = $('#moneytd').text();
           
           $('#allmoneytd').text((selectedSeats.length * seatPrice).toLocaleString());
           allmoneytd = $('#allmoneytd').text();

       }

       // 확인 버튼 클릭 시
       $('#cheakR').click(function() {
           updateSelectedSeats(); // 선택한 좌석 업데이트
       });
       
       // 결제하기 버튼 클릭 시
         $('#pay').on('click',function(){
          const time = Date.now();
          
         $("#fisiteted").val(siteted);
         $("#ficharnumtd").val(charnumtd);
         $("#fitiketsutd").val(tiketsutd);
         $("#fimoneytd").val(moneytd);
         $("#fiallmoneytd").val(allmoneytd);
           
           IMP.init('imp26845875');//아임포트 관리자 콘솔에서 확인한 '가맹점 식별코드' 입력
           IMP.request_pay({// param
               pg: "kakaopay.TC0ONETIME", //pg사명 or pg사명.CID (잘못 입력할 경우, 기본 PG사가 띄워짐)
               pay_method: "card", //지불 방법
               merchant_uid: time, //가맹점 주문번호 (아임포트를 사용하는 가맹점에서 중복되지 않은 임의의 문자열을 입력)
                                          //티켓번호 넣으면 댐
               
               name: "티켓예매", //결제창에 노출될 상품명
               amount: allmoneytd //금액
        //       buyer_email : "drc0729@naver.com", 
        //       buyer_name : "이건창",
        //       buyer_tel : "01056829550"
               
              
               
           }, function (rsp) { // callback
               if (rsp.success) {
                   alert("티켓 결제 완료되었습니다");
                  $("#fiForm").submit();
                  
               } else {
                   alert("티켓 결제가 취소되었습니다");
               }
           });
           
          

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
              
              if( $(this).hasClass('active')){
                 
                 $(this).css('background', 'darkred')
               }else {
                 
                  $(this).removeAttr('style');
                 
               }
              updateSelectedSeats(); // 선택된 좌석 업데이트
          });

       // 선택된 좌석 업데이트
       function updateSelectedSeats() {
           selectedSeats = []; // 선택한 좌석 배열 초기화
           $('.Schar.active').each(function() {
               selectedSeats.push($(this).text()); // 선택한 좌석 번호 추가
           });
           
           $('#sitetd').text(selectedSite.toLocaleString());
          siteted = $('#sitetd').text(); 
          
           $('#charnumtd').text(selectedSeats.join(', '));
           charnumtd = $('#charnumtd').text();
           
           $('#tiketsutd').text(selectedSeats.length);
           tiketsutd = $('#tiketsutd').text();
           
           $('#moneytd').text(seatPrice.toLocaleString());
           moneytd = $('#moneytd').text();
           
           $('#allmoneytd').text((selectedSeats.length * seatPrice).toLocaleString());
           allmoneytd = $('#allmoneytd').text();

       }

       // 확인 버튼 클릭 시
       $('#cheakS').click(function() {
           updateSelectedSeats(); // 선택한 좌석 업데이트
       });
       
       // 결제하기 버튼 클릭 시
         $('#pay').on('click',function(){
          const time = Date.now();
          
         $("#fisiteted").val(siteted);
         $("#ficharnumtd").val(charnumtd);
         $("#fitiketsutd").val(tiketsutd);
         $("#fimoneytd").val(moneytd);
         $("#fiallmoneytd").val(allmoneytd);
           
           IMP.init('imp26845875');//아임포트 관리자 콘솔에서 확인한 '가맹점 식별코드' 입력
           IMP.request_pay({// param
               pg: "kakaopay.TC0ONETIME", //pg사명 or pg사명.CID (잘못 입력할 경우, 기본 PG사가 띄워짐)
               pay_method: "card", //지불 방법
               merchant_uid: time, //가맹점 주문번호 (아임포트를 사용하는 가맹점에서 중복되지 않은 임의의 문자열을 입력)
                                          //티켓번호 넣으면 댐
               
               name: "티켓예매", //결제창에 노출될 상품명
               amount: allmoneytd //금액
        //       buyer_email : "drc0729@naver.com", 
        //       buyer_name : "이건창",
        //       buyer_tel : "01056829550"
               
              
               
           }, function (rsp) { // callback
               if (rsp.success) {
                   alert("티켓 결제 완료되었습니다");
                  $("#fiForm").submit();
                  
               } else {
                   alert("티켓 결제가 취소되었습니다");
               }
           });
           
          

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
              
              if( $(this).hasClass('active')){
                 
                 $(this).css('background', 'darkred')
               }else {
                 
                  $(this).removeAttr('style');
                 
               }
              updateSelectedSeats(); // 선택된 좌석 업데이트
          });

       // 선택된 좌석 업데이트
       function updateSelectedSeats() {
           selectedSeats = []; // 선택한 좌석 배열 초기화
           $('.HRchar.active').each(function() {
               selectedSeats.push($(this).text()); // 선택한 좌석 번호 추가
           });
           
           $('#sitetd').text(selectedSite.toLocaleString());
          siteted = $('#sitetd').text(); 
          
           $('#charnumtd').text(selectedSeats.join(', '));
           charnumtd = $('#charnumtd').text();
           
           $('#tiketsutd').text(selectedSeats.length);
           tiketsutd = $('#tiketsutd').text();
           
           $('#moneytd').text(seatPrice.toLocaleString());
           moneytd = $('#moneytd').text();
           
           $('#allmoneytd').text((selectedSeats.length * seatPrice).toLocaleString());
           allmoneytd = $('#allmoneytd').text();

       }

       // 확인 버튼 클릭 시
       $('#cheakHR').click(function() {
           updateSelectedSeats(); // 선택한 좌석 업데이트
       });
       
       // 결제하기 버튼 클릭 시
        $('#pay').on('click',function(){
          const time = Date.now();
          
         $("#fisiteted").val(siteted);
         $("#ficharnumtd").val(charnumtd);
         $("#fitiketsutd").val(tiketsutd);
         $("#fimoneytd").val(moneytd);
         $("#fiallmoneytd").val(allmoneytd);
           
           IMP.init('imp26845875');//아임포트 관리자 콘솔에서 확인한 '가맹점 식별코드' 입력
           IMP.request_pay({// param
               pg: "kakaopay.TC0ONETIME", //pg사명 or pg사명.CID (잘못 입력할 경우, 기본 PG사가 띄워짐)
               pay_method: "card", //지불 방법
               merchant_uid: time, //가맹점 주문번호 (아임포트를 사용하는 가맹점에서 중복되지 않은 임의의 문자열을 입력)
                                          //티켓번호 넣으면 댐
               
               name: "티켓예매", //결제창에 노출될 상품명
               amount: allmoneytd //금액
        //       buyer_email : "drc0729@naver.com", 
        //       buyer_name : "이건창",
        //       buyer_tel : "01056829550"
               
              
               
           }, function (rsp) { // callback
               if (rsp.success) {
                   alert("티켓 결제 완료되었습니다");
                  $("#fiForm").submit();
                  
               } else {
                   alert("티켓 결제가 취소되었습니다");
               }
           });
           
          

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
           
           if( $(this).hasClass('active')){
              
              $(this).css('background', 'darkred')
            }else {
              
               $(this).removeAttr('style');
              
            }
           updateSelectedSeats(); // 선택된 좌석 업데이트
       });

      
     
        
       // 선택된 좌석 업데이트
       function updateSelectedSeats() {
          
           selectedSeats = []; // 선택한 좌석 배열 초기화
           $('.HR2-char.active').each(function() {
               selectedSeats.push($(this).text()); // 선택한 좌석 번호 추가
           });
               
          $('#sitetd').text(selectedSite.toLocaleString());
          siteted = $('#sitetd').text(); 
          
           $('#charnumtd').text(selectedSeats.join(', '));
           charnumtd = $('#charnumtd').text();
           
           $('#tiketsutd').text(selectedSeats.length);
           tiketsutd = $('#tiketsutd').text();
           
           $('#moneytd').text(seatPrice.toLocaleString());
           moneytd = $('#moneytd').text();
           
           $('#allmoneytd').text((selectedSeats.length * seatPrice).toLocaleString());
           allmoneytd = $('#allmoneytd').text();

           
       }

       // 확인 버튼 클릭 시
       $('#cheakHR2').click(function() {
           updateSelectedSeats(); // 선택한 좌석 업데이트
       });
       
        // 결제하기 버튼 클릭 시
       $('#pay').on('click',function(){
          const time = Date.now();
          
         $("#fisiteted").val(siteted);
         $("#ficharnumtd").val(charnumtd);
         $("#fitiketsutd").val(tiketsutd);
         $("#fimoneytd").val(moneytd);
         $("#fiallmoneytd").val(allmoneytd);
           
           IMP.init('imp26845875');//아임포트 관리자 콘솔에서 확인한 '가맹점 식별코드' 입력
           IMP.request_pay({// param
               pg: "kakaopay.TC0ONETIME", //pg사명 or pg사명.CID (잘못 입력할 경우, 기본 PG사가 띄워짐)
               pay_method: "card", //지불 방법
               merchant_uid: time, //가맹점 주문번호 (아임포트를 사용하는 가맹점에서 중복되지 않은 임의의 문자열을 입력)
                                          //티켓번호 넣으면 댐
               
               name: "티켓예매", //결제창에 노출될 상품명
               amount: allmoneytd //금액
        //       buyer_email : "drc0729@naver.com", 
        //       buyer_name : "이건창",
        //       buyer_tel : "01056829550"
               
              
               
           }, function (rsp) { // callback
               if (rsp.success) {
                   alert("티켓 결제 완료되었습니다");
                  $("#fiForm").submit();
               } else {
                   alert("티켓 결제가 취소되었습니다");
               }
           });
           
          

       }); 
       
       
   });
</script>

<body>
<% 
LoginVO loginId = (LoginVO)session.getAttribute("loginSign");

List<MatchVO> match = (List<MatchVO>)request.getAttribute("ticketMatchList");


List<TicketVO> sectionList = (List<TicketVO>)request.getAttribute("sectionList");



// 예매 티켓 전체 출력
List<TicketVO> getTicketList = (List<TicketVO>)request.getAttribute("getTicket");

// 좌석 구간 확인하려고 하는데... 잘 안되네?? 어떻게 하면 좋을까?? 잘해야지 물어보지말고 실행!
List<TicketVO> ticketList = (List<TicketVO>)request.getAttribute("ticketList");


// 경기 예매 일정 (현재날짜 이후) 출력
List<MatchVO> matchList2 = (List<MatchVO>)request.getAttribute("matchList2");

// 날짜??
//String res = (String)request.getAttribute("matchTicketDate");


 String responseDateFromAjax = request.getParameter("matchDate"); 

%>   


   <div class="upnav">
      <img src="<%=request.getContextPath() %>/resources/images/로고.png">
      <ul class="snip1143">
         <li><a href="<%=request.getContextPath() %>/ticket.do" data-hover="예매하기">예매하기</a></li>
         <li><a href="<%=request.getContextPath() %>/ticketCheck.do" data-hover="예매내역 확인/취소">예매내역 확인/취소</a></li>
         
              
      </ul>
   </div>

   <!-- <form id="chocemenu" method="get" action="<%=request.getContextPath() %>/ticketPurchase.do">       -->

   <div id="fristui">
      <table id="fristtb">
         <thead>
            <tr id="thtr">
               <th id="th1">경기일시</th>
               <th id="th2">경기명</th>
               <th id="th3">경기장</th>
               <th id="th4">티켓예매</th>
            </tr>
         </thead>
         <tbody id="tBody">
            <%
               for (MatchVO vo : matchList2) {
            %>
            <tr id="1st">
               <td id="gamedate">
                  <div id="gdate1">
                     <input type="hidden" value="<%=vo.getM_date()%>" name="gdate1" id="mDate"><%=vo.getM_date()%>
                  </div>
                  <div id="gdate2">(<%=vo.getM_day()%>)<%=vo.getM_time()%></div>
               </td>
               <td id="gamename">
                  <div id="logo1">
                     <img src="<%=request.getContextPath()%>/resources/images/로고.png">
                  </div>
                  <span id="verse">VS</span>
                  <div id="logo2">
                     <img src="<%=request.getContextPath()%>/resources/images/<%=vo.getA_image()%>">
                  </div>
                  <div id="hometeam">DDIT 언더독스</div> <span id="verse2">VS</span>
                  <div id="awayTeam" style="font-size: 25px; font-family: 'kbob'; width: 200px; float: left; margin-top: 40px; margin-left: 30px">
                     <input type="hidden" value="<%=vo.getA_name()%>" id="awayTeam1"><%=vo.getA_name()%>
                  </div>
               </td>
               <td id="gameplace"><div id="placename">언더독스 파크</div></td>
               <td id="tiketbutton"><button type=button class="nexttiket">예매하기</button></td>
            </tr>
            <%
               }
            %>
         </tbody>




      </table>
      <form action="${pageContext.request.contextPath }/ticketPurchase.do" method="post" id="fiForm">
         <input type="hidden" name="mDate" value="" id="fimDate" />
         <input type="hidden" name="siteted" value="" id="fisiteted" />
         <input type="hidden" name="charnumtd" value="" id="ficharnumtd" />
         <input type="hidden" name="tiketsutd" value="" id="fitiketsutd" />
         <input type="hidden" name="moneytd" value="" id="fimoneytd" />
         <input type="hidden" name="allmoneytd" value="" id="fiallmoneytd" />
         <input type="hidden" name="awayTeam" value="" id="fiawayTeam" />
      </form>
   </div>
   
   
   
   <div id="choce1">
      <div id="chocebutton">
         <img src="<%=request.getContextPath()%>/resources/images/가격별png.png">

         <%
            for (TicketVO section : sectionList) {
         %>
         <button type="button" id="<%=section.getS_section()%>" value="<%=section.getS_section()%>" name="sectionSection"><%=section.getS_section()%></button>
         <%
            }
         %>
      </div>

      <%
         for (TicketVO section : sectionList) {
         int seatCnt = 0;
         if ("A".equals(section.getS_section())) {
            seatCnt = 100;
      %>
      <div id="<%=section.getS_section()%>all">
         <h2 id="<%=section.getS_section()%>H2"><%=section.getS_section()%></h2>
         <div class="aclass">
            <%
               for (int i = 1; i <= seatCnt; i++) {
               boolean seatOk = false;
               for (TicketVO tVo : ticketList) {
                  if (i == tVo.getB_seat() && "A".equals(tVo.getS_section())) {
               seatOk = true;
               break;
                  }
               }

               if (seatOk) { // 예약된 번호
            %>
            <button type="button" class="<%=section.getS_section()%>char"
               id="<%=section.getS_section() + i%>"
               value="<%=section.getS_section() + i%>" disabled
               style="background-color: red"><%=i%></button>
            <%
               } else {
            %>
            <button type="button" class="<%=section.getS_section()%>char"
               id="<%=section.getS_section() + i%>"
               value="<%=section.getS_section() + i%>"><%=i%></button>
            <%
               }

            if (i % 10 == 0) {
            %>
            <br>
            <%
               }
            }
            %>
         </div>
         <button type="button" id="back<%=section.getS_section()%>">이전페이지</button>
         <button type="button" id="cheak<%=section.getS_section()%>">확인</button>
      </div>

      <%
         } else if ("B".equals(section.getS_section())) {
      seatCnt = 100;
      %>
      <div id="<%=section.getS_section()%>all">
         <h2 id="<%=section.getS_section()%>H2"><%=section.getS_section()%></h2>
         <div class="bclass">
            <%
               for (int i = 1; i <= seatCnt; i++) {
               boolean seatOk = false;
               for (TicketVO tVo : ticketList) {
                  if (i == tVo.getB_seat() && "B".equals(tVo.getS_section())) {
               seatOk = true;
               break;
                  }
               }

               if (seatOk) { // 예약된 번호
            %>
            <button type="button" class="<%=section.getS_section()%>char"
               id="<%=section.getS_section() + i%>"
               value="<%=section.getS_section() + i%>" disabled
               style="background-color: red"><%=i%></button>
            <%
               } else {
            %>
            <button type="button" class="<%=section.getS_section()%>char"
               id="<%=section.getS_section() + i%>"
               value="<%=section.getS_section() + i%>"><%=i%></button>
            <%
               }

            if (i % 10 == 0) {
            %>
            <br>
            <%
               }
            }
            %>
         </div>
         <button type="button" id="back<%=section.getS_section()%>">이전페이지</button>
         <button type="button" id="cheak<%=section.getS_section()%>">확인</button>
      </div>
      <%
         } else if ("R".equals(section.getS_section())) {
      seatCnt = 50;
      %>
      <div id="<%=section.getS_section()%>all">
         <h2 id="<%=section.getS_section()%>H2"><%=section.getS_section()%></h2>
         <div class="<%=section.getS_section()%>class">
            <%
               for (int i = 1; i <= seatCnt; i++) {
               boolean seatOk = false;
               for (TicketVO tVo : ticketList) {
                  if (i == tVo.getB_seat() && "R".equals(tVo.getS_section())) {
               seatOk = true;
               break;
                  }
               }

               if (seatOk) { // 예약된 번호
            %>
            <button type="button" class="<%=section.getS_section()%>char"
               id="<%=section.getS_section() + i%>"
               value="<%=section.getS_section() + i%>" disabled
               style="background-color: red"><%=i%></button>
            <%
               } else {
            %>
            <button type="button" class="<%=section.getS_section()%>char"
               id="<%=section.getS_section() + i%>"
               value="<%=section.getS_section() + i%>"><%=i%></button>
            <%
               }

            if (i % 10 == 0) {
            %>
            <br>
            <%
               }
            }
            %>
         </div>
         <button type="button" id="back<%=section.getS_section()%>">이전페이지</button>
         <button type="button" id="cheak<%=section.getS_section()%>">확인</button>
      </div>
      <%
         } else if ("S".equals(section.getS_section())) {
      seatCnt = 20;
      %>
      <div id="<%=section.getS_section()%>all">
         <h2 id="<%=section.getS_section()%>H2"><%=section.getS_section()%></h2>
         <div class="<%=section.getS_section()%>class">
            <%
               for (int i = 1; i <= seatCnt; i++) {
               boolean seatOk = false;
               for (TicketVO tVo : ticketList) {
                  if (i == tVo.getB_seat() && "S".equals(tVo.getS_section())) {
               seatOk = true;
               break;
                  }
               }

               if (seatOk) { // 예약된 번호
            %>
            <button type="button" class="<%=section.getS_section()%>char"
               id="<%=section.getS_section() + i%>"
               value="<%=section.getS_section() + i%>" disabled
               style="background-color: red"><%=i%></button>
            <%
               } else {
            %>
            <button type="button" class="<%=section.getS_section()%>char"
               id="<%=section.getS_section() + i%>"
               value="<%=section.getS_section() + i%>"><%=i%></button>
            <%
               }

            if (i % 10 == 0) {
            %>
            <br>
            <%
               }
            }
            %>
         </div>
         <button type="button" id="back<%=section.getS_section()%>">이전페이지</button>
         <button type="button" id="cheak<%=section.getS_section()%>">확인</button>
      </div>
      <%
         } else if ("F".equals(section.getS_section())) {
      seatCnt = 50;
      %>
      <div id="<%=section.getS_section()%>all">
         <h2 id="<%=section.getS_section()%>H2"><%=section.getS_section()%></h2>
         <div class="<%=section.getS_section()%>class">
            <%
               for (int i = 1; i <= seatCnt; i++) {
               boolean seatOk = false;
               for (TicketVO tVo : ticketList) {
                  if (i == tVo.getB_seat() && "F".equals(tVo.getS_section())) {
               seatOk = true;
               break;
                  }
               }

               if (seatOk) { // 예약된 번호
            %>
            <button type="button" class="<%=section.getS_section()%>char"
               id="<%=section.getS_section() + i%>"
               value="<%=section.getS_section() + i%>" disabled
               style="background-color: red"><%=i%></button>
            <%
               } else {
            %>
            <button type="button" class="<%=section.getS_section()%>char"
               id="<%=section.getS_section() + i%>"
               value="<%=section.getS_section() + i%>"><%=i%></button>
            <%
               }

            if (i % 10 == 0) {
            %>
            <br>
            <%
               }
            }
            %>
         </div>
         <button type="button" id="back<%=section.getS_section()%>">이전페이지</button>
         <button type="button" id="cheak<%=section.getS_section()%>">확인</button>
      </div>
      <%
         } else if ("HR".equals(section.getS_section())) {
      seatCnt = 75;
      %>
      <div id="<%=section.getS_section()%>all">
         <h2 id="<%=section.getS_section()%>H2"><%=section.getS_section()%></h2>
         <div class="<%=section.getS_section()%>class">
            <%
               for (int i = 1; i <= seatCnt; i++) {
               boolean seatOk = false;
               for (TicketVO tVo : ticketList) {
                  if (i == tVo.getB_seat() && "HR".equals(tVo.getS_section())) {
               seatOk = true;
               break;
                  }
               }

               if (seatOk) { // 예약된 번호
            %>
            <button type="button" class="<%=section.getS_section()%>char"
               id="<%=section.getS_section() + i%>"
               value="<%=section.getS_section() + i%>" disabled
               style="background-color: red"><%=i%></button>
            <%
               } else {
            %>
            <button type="button" class="<%=section.getS_section()%>char"
               id="<%=section.getS_section() + i%>"
               value="<%=section.getS_section() + i%>"><%=i%></button>
            <%
               }

            if (i % 10 == 0) {
            %>
            <br>
            <%
               }
            }
            %>
         </div>
         <button type="button" id="back<%=section.getS_section()%>">이전페이지</button>
         <button type="button" id="cheak<%=section.getS_section()%>">확인</button>
      </div>
      <%
         } else if ("HR2".equals(section.getS_section())) {
      seatCnt = 25;
      %>
      <div id="<%=section.getS_section()%>-all">
         <h2 id="<%=section.getS_section()%>-H2"><%=section.getS_section()%></h2>
         <div class="<%=section.getS_section()%>-class">
            <%
               for (int i = 1; i <= seatCnt; i++) {
               boolean seatOk = false;
               for (TicketVO tVo : ticketList) {
                  if (i == tVo.getB_seat() && "HR2".equals(tVo.getS_section())) {
               seatOk = true;
               break;
                  }
               }

               if (seatOk) { // 예약된 번호
            %>
            <button type="button" class="<%=section.getS_section()%>-char"
               id="<%=section.getS_section() + i%>"
               value="<%=section.getS_section() + i%>" disabled
               style="background-color: red"><%=i%></button>
            <%
               } else {
            %>
            <button type="button" class="<%=section.getS_section()%>-char"
               id="<%=section.getS_section() + i%>"
               value="<%=section.getS_section() + i%>"><%=i%></button>
            <%
               }

            if (i % 10 == 0) {
            %>
            <br>
            <%
               }
            }
            %>
         </div>
         <button type="button" id="back<%=section.getS_section()%>">이전페이지</button>
         <button type="button" id="cheak<%=section.getS_section()%>">확인</button>
      </div>

      <%
         }
      }
      %>





      <div id="allsum">
         <img src="<%=request.getContextPath()%>/resources/images/티켓안내.png">
         <table id="sangse">
            <tr>
               <th id="site">구간</th>
               <th id="charnum">좌석번호</th>
               <th id="tiketsu">수량</th>
               <th id="money">금액</th>
               <th id="allmoney">총금액</th>
            </tr>
            <tr id="downtr">
               <td id="sitetd">A</td>
               <td id="charnumtd">21</td>
               <td id="tiketsutd">2</td>
               <td id="moneytd">10,000</td>
               <td id="allmoneytd">20,000</td>
            </tr>
         </table>
         <div id="button12">

            <div id="pay1">
               <input type="button" id="pay" value="결제하기">
            </div>
            <div id="main1">
               <button type="button" onclick="window.close()" id="main">취소하기</button>
            </div>
         </div>
      </div>


   </div>
   <!--   </form>      -->

</body>
</html>
