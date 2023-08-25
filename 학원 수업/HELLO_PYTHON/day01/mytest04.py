# 첫수를 입력하세요 1
# 끝수를 입력하세요 4
# 1에서 4까지의 합은 10입니다.

a = input("첫 수를 입력하세요")
b = input("끝 수를 입력하세요")
aa = int(a)
bb = int(b)

sum = 0

for i in range(aa, bb + 1):
    sum += i
print("{}에서 {}까지의 합은 {}입니다.".format(aa,bb,sum))
