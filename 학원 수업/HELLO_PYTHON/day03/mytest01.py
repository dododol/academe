# com = 1~99까지 숫자
# 숫자를 맞춰보세요 20(enter)
# 20_up
# 숫자를 맞춰보세요 51(enter)
# 51_down
# 숫자를 맞춰보세요 50(enter)
# 50-정답입니다. 

from random import random
com = int(random()*99) + 1
print("com",com)
#com = 50

while True:
    mine = input("숫자를 넣으세요")
    imine = int(mine)
    
    if com > imine :
        print("{}\tUP".format(mine))
    elif com < imine :
        print("{}\tDOWN".format(mine))
    else:
        print("{}정답입니다.".format(mine))
        break