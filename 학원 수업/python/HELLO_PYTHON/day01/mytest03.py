# 첫째수를 입력하시오 7
# 둘째수를 입력하시오 8
# 7과 8의 합은 15입니다.

num1 = input("숫자를 입력하시오")
num2 = input("숫자를 입력하시오")

sum = int(num1)+int(num2)
print(num1 , "과(와)" , num2 , "의 합은 " , sum , "입니다.")
print("{}과 {}의 합은 {}입니다.".format(num1,num2,sum))