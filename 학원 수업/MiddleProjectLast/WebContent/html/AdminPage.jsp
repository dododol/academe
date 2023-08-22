<%@page import="kr.or.ddit.middle.vo.RefundVO"%>
<%@page import="kr.or.ddit.middle.vo.BookingVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.middle.vo.LoginVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="true" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>관리자</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery-3.7.0.min.js"></script>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/관리자.css" rel="stylesheet" type="text/css">
	<link rel="shortcut icon" href="<%=request.getContextPath()%>/resources/images/미니.png">
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
	<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery-3.7.0.min.js"></script>
</head>
	<script>
	$(function(){
	    $('#user').click(function(){
		    if($(".userlist").css("display") == "none"){
	            $('.userlist').show();
	    	}
	    });
	    
	    $('#user').click(function(){
		    if($("#mainimg").css("display") != "none"){
	            $('#mainimg').hide();
	    	} 
		    if($(".tiketlist").css("display") != "none"){
	            $('.tiketlist').hide();
	    	}
		    if($(".tiketrelist").css("display") != "none"){
	            $('.tiketrelist').hide();
	    	}
		    if($("#paytb6").css("display") != "none"){
	            $('#paytb6').hide();
	    	}
		    if($("#paytb7").css("display") != "none"){
	            $('#paytb7').hide();
	    	}
		    if($("#paytb8").css("display") != "none"){
	            $('#paytb8').hide();
	    	}
		    if($("#paytb9").css("display") != "none"){
	            $('#paytb9').hide();
	    	}
		    if($("#paytba").css("display") != "none"){
	            $('#paytba').hide();
	    	}
    	});
	    
	    
	    $('#tiket').click(function(){
		    if($(".tiketlist").css("display") == "none"){
	            $('.tiketlist').show();
	    	}
	    });
	    
	    
	    $('#tiket').click(function(){
		    if($("#mainimg").css("display") != "none"){
	            $('#mainimg').hide();
	    	} 
		    if($(".userlist").css("display") != "none"){
	            $('.userlist').hide();
	    	}
		    if($("#paytb6").css("display") != "none"){
	            $('#paytb6').hide();
	    	}
		    if($("#paytb7").css("display") != "none"){
	            $('#paytb7').hide();
	    	}
		    if($("#paytb8").css("display") != "none"){
	            $('#paytb8').hide();
	    	}
		    if($("#paytb9").css("display") != "none"){
	            $('#paytb9').hide();
	    	}
		    if($("#paytba").css("display") != "none"){
	            $('#paytba').hide();
	    	}
		    if($(".tiketrelist").css("display") != "none"){
	            $('.tiketrelist').hide();
	    	}
		    
	    });
	    
	    $('#pay').click(function(){
		    if($("#paytb6").css("display") == "none"){
	            $('#paytb6').show();
	    	}
	    });
	    
	    $('#pay').click(function(){
		    if($("#mainimg").css("display") != "none"){
	            $('#mainimg').hide();
	    	} 
		    if($(".userlist").css("display") != "none"){
	            $('.userlist').hide();
	    	}
		    if($(".tiketlist").css("display") != "none"){
	            $('.tiketlist').hide();		        	         
	    	}
		    if($(".tiketrelist").css("display") != "none"){
	            $('.tiketrelist').hide();
	    	}
		    if($("#paytb7").css("display") != "none"){
	            $('#paytb7').hide();
	    	}
		    if($("#paytb8").css("display") != "none"){
	            $('#paytb8').hide();
	    	}
		    if($("#paytb9").css("display") != "none"){
	            $('#paytb9').hide();
	    	}
		    if($("#paytba").css("display") != "none"){
	            $('#paytba').hide();
	    	}
	    });
	    
	    $('#beforebt6').click(function(){
	    	alert('마지막 달입니다');
	    });
	    
	    $('#nextbt6').click(function(){
		    if($("#paytb7").css("display") == "none"){
	            $('#paytb7').show();
	    	}
	    });
	    
	    $('#nextbt6').click(function(){
		    if($("#paytb6").css("display") != "none"){
	            $('#paytb6').hide();
		    }
	    });

	    $('#nextbt7').click(function(){
		    if($("#paytb8").css("display") == "none"){
	            $('#paytb8').show();
	    	}
	    });
    	
	    $('#nextbt7').click(function(){
		    if($("#paytb7").css("display") != "none"){
	            $('#paytb7').hide();
		    }
	    });
	    
	    $('#nextbt8').click(function(){
		    if($("#paytb9").css("display") == "none"){
	            $('#paytb9').show();
	    	}
	    });
	    
	    $('#nextbt8').click(function(){
		    if($("#paytb8").css("display") != "none"){
	            $('#paytb8').hide();
		    }
	    });
	    
	    $('#nextbt9').click(function(){
	    	alert('마지막 달입니다');
	    });
	    
	    $('#beforebt7').click(function(){
		    if($("#paytb7").css("display") != "none"){
	            $('#paytb7').hide();
		    }
	    });
	    
	    $('#beforebt7').click(function(){
		    if($("#paytb6").css("display") == "none"){
	            $('#paytb6').show();
	    	}
	    });
	    
	    $('#beforebt8').click(function(){
		    if($("#paytb8").css("display") != "none"){
	            $('#paytb8').hide();
		    }
	    });
	    
	    $('#beforebt8').click(function(){
		    if($("#paytb7").css("display") == "none"){
	            $('#paytb7').show();
	    	}
	    });
	    
	    $('#beforebt9').click(function(){
		    if($("#paytb9").css("display") != "none"){
	            $('#paytb9').hide();
		    }
	    });
	    
	    $('#beforebt9').click(function(){
		    if($("#paytb8").css("display") == "none"){
	            $('#paytb8').show();
	    	}
	    });
	    
	    /* -------------------------------------------------------------------------- */	    
	    
	    $('#allbtn6').click(function(){
		    if($("#paytb6").css("display") != "none"){
	            $('#paytb6').hide();
		    }
	    });
	    
	    $('#allbtn6').click(function(){
		    if($("#paytba").css("display") == "none"){
	            $('#paytba').show();
	    	}
	    });
	    
	    $('#allbtn7').click(function(){
		    if($("#paytb7").css("display") != "none"){
	            $('#paytb7').hide();
		    }
	    });
	    
	    $('#allbtn7').click(function(){
		    if($("#paytba").css("display") == "none"){
	            $('#paytba').show();
	    	}
	    });
	    
	    $('#allbtn8').click(function(){
		    if($("#paytb8").css("display") != "none"){
	            $('#paytb8').hide();
		    }
	    });
	    
	    $('#allbtn8').click(function(){
		    if($("#paytba").css("display") == "none"){
	            $('#paytba').show();
	    	}
	    });
	    
	    $('#allbtn9').click(function(){
		    if($("#paytb9").css("display") != "none"){
	            $('#paytb9').hide();
		    }
	    });
	    
	    $('#allbtn9').click(function(){
		    if($("#paytba").css("display") == "none"){
	            $('#paytba').show();
	    	}
	    });
	    
	    $('.relistbt').click(function(){
		    if($(".tiketlist").css("display") != "none"){
	            $('.tiketlist').hide();
		    }
	    });
	    
	    $('.relistbt').click(function(){
		    if($(".tiketrelist").css("display") == "none"){
	            $('.tiketrelist').show();
	    	}
	    });
	    
	    $('.listbt').click(function(){
		    if($(".tiketrelist").css("display") != "none"){
	            $('.tiketrelist').hide();
		    }
	    });
	    
	    $('.listbt').click(function(){
		    if($(".tiketlist").css("display") == "none"){
	            $('.tiketlist').show();
	    	}
	    });	   
});

</script>
<%
List<LoginVO> list = (List<LoginVO>)request.getAttribute("memberInfoList");
BookingVO booking = (BookingVO)request.getAttribute("allPrice");
List<BookingVO> ticketList = (List<BookingVO>)request.getAttribute("allTicket");
List<BookingVO> refundList = (List<BookingVO>)request.getAttribute("refundTicketList");

%>

<body>
<nav>
<div class="btn1">
<button class="btn" id="user"><span><i class="fa fa-user"></i><br>회원정보</span></button>
<button class="btn" id="tiket"><span><i class="fa fa-ticket"></i><br>예매내역</span></button>
<button class="btn" id="pay"><span><i class="fa fa-dollar"></i><br>매출현황</span></button>   
</div>
</nav>      

<div id="mainimg"><img id="mainimg2" src="<%=request.getContextPath()%>/resources/images/로고.png"></div>

   

<div class="userlist">
<table>
        <caption class="title">회원목록</caption>
        <thead>
            <tr>
                <th>이름</th>
                <th>아이디</th>
                <th>주민등록번호</th>
                <th>전화번호</th>
                <th>거주지</th>
            <th>탈퇴여부</th>
            </tr>
        </thead>
        <tbody id="trid">
<%
   if(list == null || list.size() == 0){
%>   
            <tr>
                <td colspan="6">
                                      고객정보가 없습니다.
                </td>
            </tr>
<%
   }else{
      for(LoginVO vo : list){      
      
%>         
         <tr>
                <td><%=vo.getMem_name() %></td>
                <td><%=vo.getMem_id() %></td>
                <td><%=vo.getMem_num() %></td>
                <td><%=vo.getMem_tel() %></td>
            <td><%=vo.getMem_addr1() %></td>
                <td>
                <form method="get" action="<%=request.getContextPath()%>/adminDeleteMem.do">
                <input type="hidden" name="id" value="<%=vo.getMem_id()%>">
                 <input type="submit" id="memDelete" class="delete" value="탈퇴하기" onclick="return confirmDelete()">
                 </form>
                </td>
            </tr>
                    
                    
        
            
<%         
      }   
   }
%>              
   
        </tbody>
    </table>   
</div>   

<div class="tiketlist">
<table>
        <caption class="title">예매내역</caption> 
        <button type="button" class="relistbt">환불내역</button>
        <thead>
            <tr>
               <th>티켓번호</th>
                <th>아이디</th>
                <th>경기날짜</th>
                <th>경기일정</th>
                <th>좌석</th>
            <th>결제금액</th>
            <th>취소여부</th>
            </tr>
        </thead>
        <tbody>
        <%
   if(ticketList == null || ticketList.size() == 0){
%>   
            <tr>
                <td colspan="6">
                                      예매내역이 없습니다.
                </td>
            </tr>
<%
   }else{
      for(BookingVO vo : ticketList){      
      
%>   
   
            <tr>
                 <td><%=vo.getB_num() %></td>
                <td><%=vo.getMem_id() %></td>
                <td><%=vo.getM_date().substring(0, 11) %></td>
                <td>대덕 언더독스 VS <%=vo.getA_name() %> </td>
                <td><%=vo.getS_section() %>-<%=vo.getB_seat() %></td>
            <td><%=vo.getB_price() %></td>
                <td>
                    <form method="get" action="<%=request.getContextPath()%>/adminTicketCancel.do">
                <input type="hidden" name="b_no" id="b_no" value="<%=vo.getB_num()%>">
                 <input type="submit" id="ticketCancel" class="delete" value="취소하기" onclick="return ticketDelete()">
                 </form> 
                </td>
            </tr>
            
<%
      }
   }
%>
            
         
      
        </tbody>
    </table>   
</div>   

<div class="tiketrelist">
<table>
        <caption class="title">환불내역</caption>
          <button type="button" class="listbt">예매내역</button>
        <thead>
            <tr>
                <th>티켓번호</th>
                <th>아이디</th>
                <th>경기일정</th>
                <th>경기날짜</th>
                <th>결제상태</th>
            <th>환불금액</th>
            </tr>
        </thead>
        <tbody>
         <%
   if(refundList == null || refundList.size() == 0){
%>   
            <tr>
                <td colspan="6">
                                      환불내역이 없습니다.
                </td>
            </tr>
<%
   }else{
      for(BookingVO vo : refundList){      
      
%>   
            <tr>
                <td><%=vo.getB_num() %></td>
                <td><%=vo.getMem_id() %></td>
                <td>대덕 언더독스 VS <%=vo.getA_name() %></td>
                <td><%=vo.getM_date().substring(0, 11) %></td>
            <td><%=vo.getB_stat() %></td>
            <td><%=vo.getB_price() %></td>         
            </tr>

 <%
      }
   }
%>           
        </tbody>
    </table>   	
</div>	


	<%
	
    List<BookingVO> booking6List = (List<BookingVO>)request.getAttribute("price6List");
    List<BookingVO> booking7List = (List<BookingVO>)request.getAttribute("price7List");
    List<BookingVO> booking8List = (List<BookingVO>)request.getAttribute("price8List");
    List<BookingVO> booking9List = (List<BookingVO>)request.getAttribute("price9List");
    
    List<RefundVO> refund6List = (List<RefundVO>)request.getAttribute("refund6List");
    List<RefundVO> refund7List = (List<RefundVO>)request.getAttribute("refund7List");
    List<RefundVO> refund8List = (List<RefundVO>)request.getAttribute("refund8List");
    List<RefundVO> refund9List = (List<RefundVO>)request.getAttribute("refund9List");

    
	%>
	
	
	<div id="paytb6">
	<div class="btwhich"><button type="button" id="beforebt6" class="custom-btn btn-2"> ◀ 이전 달</button> <button type="button" id="nextbt6" class="custom-btn btn-2">다음 달 ▶</button></div>	
	<table class="container">
		<caption class="title">6월 매출</caption>
  <thead>
    <tr>
      <th>예매금액</th>
      <th>환불금액</th>
      <th>총금액</th>
    </tr>
  </thead>
  	<tbody>
  <%
  int retotal3=0;
	for(RefundVO reVO4 : refund6List) {
		 retotal3 += reVO4.getR_refund();	
	}
  
  
  	int total3=0;
  	for(BookingVO bkVO4 : booking6List) {
  		 total3 += bkVO4.getB_price();
  	}
  	
  	int priceSum3=total3 - retotal3;
	%>
    <tr>
      <td><%=total3 %></td>	
      <td><%=retotal3%></td>
      <td><%=priceSum3%></td>
    </tr>
  </tbody> 
</table>
	

	<button type="button" id="allbtn6" class="custom-btn btn-2">총 매출</button>
	</div>
	
	<div id="paytb7">
	<div class="btwhich"><button type="button" id="beforebt7" class="custom-btn btn-2"> ◀ 이전 달</button> <button type="button" id="nextbt7" class="custom-btn btn-2">다음 달 ▶</button></div>	
	<table class="container">
		<caption class="title">7월 매출</caption>
  <thead>
    <tr>
      <th>예매금액</th>
      <th>환불금액</th>
      <th>총금액</th>
    </tr>
  </thead>
  	<tbody>
  <%
  int retotal2=0;
	for(RefundVO reVO5 : refund7List) {
		 retotal2 += reVO5.getR_refund();	
	}
  
  
  	int total2=0;
  	for(BookingVO bkVO5 : booking7List) {
  		 total2 += bkVO5.getB_price();
  	}
  	
  	int priceSum2=total2 - retotal2;
	%>
    <tr>
      <td><%=total2 %></td>	
      <td><%=retotal2%></td>
      <td><%=priceSum2%></td>
    </tr>
  </tbody>
</table>
	<button type="button" id="allbtn7" class="custom-btn btn-2">총 매출</button>
	</div>
	
	
	<div id="paytb8">
	<div class="btwhich"><button type="button" id="beforebt8" class="custom-btn btn-2"> ◀ 이전 달</button> <button type="button" id="nextbt8" class="custom-btn btn-2">다음 달 ▶</button></div>	
	<table class="container">
		<caption class="title">8월 매출</caption>
  <thead>
    <tr>
      <th>예매금액</th>
      <th>환불금액</th>
      <th>총금액</th>
    </tr>
  </thead>
  	<tbody>
  <%
  int retotal=0;
	for(RefundVO reVO1 : refund8List) {
		 retotal += reVO1.getR_refund();	
	}
  
  
  	int total=0;
  	for(BookingVO bkVO1 : booking8List) {
  		 total += bkVO1.getB_price();
  	}
  	
  	int priceSum=total - retotal;
	%>
    <tr>
      <td><%=total%></td>	
      <td><%=retotal%></td>
      <td><%=priceSum%></td>
    </tr>
  </tbody>
</table>
	<button type="button" id="allbtn8" class="custom-btn btn-2">총 매출</button>
	</div>
	
	<div id="paytb9">
	<div class="btwhich"><button type="button" id="beforebt9" class="custom-btn btn-2"> ◀ 이전 달</button> <button type="button" id="nextbt9" class="custom-btn btn-2">다음 달 ▶</button></div>	
	<table class="container">
		<caption class="title">9월 매출</caption>
  <thead>
    <tr>
      <th>예매금액</th>
      <th>환불금액</th>
      <th>총금액</th>
    </tr>
  </thead>
  	<tbody>

  <% 	  
  	int retotal1=0;
	for(RefundVO reVO2 : refund9List) {
		 retotal1 += reVO2.getR_refund();	
	}
  
  
  	int total1=0;
  	for(BookingVO bkVO2 : booking9List) {
  		 total1 += bkVO2.getB_price();
  	}
  	
  	int priceSum1=total1 - retotal1;
	%>
    <tr>
      <td><%=total1 %></td>	
      <td><%=retotal1%></td>
      <td><%=priceSum1%></td>
    </tr>

  </tbody>
</table>
	<button type="button" id="allbtn9" class="custom-btn btn-2">총 매출</button>
	</div>
	
	<div id="paytba">
	<div class="btwhich"><button type="button" id="beforebta" class="custom-btn btn-2" style="background:black"></button> <button type="button" id="nextbta" class="custom-btn btn-2" style="background:black"></button></div>	
	<table class="container">
		<caption class="title">총 매출</caption>
  <thead>
    <tr>	
		<th>월</th>
      <th>예매금액</th>
      <th>환불금액</th>
      <th>총금액</th>
    </tr>
  </thead>
  <tbody>
    <tr>
	   <td>6월</td>
      <td><%=total3 %></td>
      <td><%=retotal3%></td>
      <td><%=priceSum3%></td>
    </tr>
	  
	   <tr>
	   <td>7월</td>
      <td><%=total2 %></td>
      <td><%=retotal2%></td>
      <td><%=priceSum2%></td>
    </tr>
    
	   <tr>
	   <td>8월</td>
      <td><%=total %></td>
      <td><%=retotal%></td>
      <td><%=priceSum%></td>
    </tr>
	  
	   <tr>
	   <td>9월</td>
      <td><%=total1 %></td>
      <td><%=retotal1%></td>
      <td><%=priceSum1%></td>
    </tr>
	  
	   <tr>
      <td id="allpay" colspan='2'>총액</td>
      <td colspan='2'><%=priceSum1+priceSum+priceSum2+priceSum3%></td>
    </tr>
 
  </tbody>
</table>
	<button type="button" id="allbtna" class="custom-btn btn-2">총 매출</button>
	</div>
</body>
</html>
