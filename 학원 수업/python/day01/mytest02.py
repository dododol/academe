# 홀/짝을 선택하시오 홀 (input - 홀/짝)
# 나 : 홀
# 컴 : 홀
# 결과 : 이김
from random import random

a = input("홀/짝을 입력하세요 : ")
print('ekdtls : ',a)
b=random()*2
c=['홀','짝']
d=c[int(b)]
print('컴퓨터 :',d)
if(a==b):
    print("당신이 이겼습니다.")
else :
    print("당신은 패배하였습니다.")