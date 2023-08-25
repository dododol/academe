# (책보고)자바에 있는 animal, human, boolean 파이썬으로 만들기

class Animal:
    def __init__(self):
        self.flagLife = True
    def die(self):
        self.flagLife = False
        
class Human(Animal):
    
    def __init__(self):
        super().__init__()
        self.job = "백수"
    def chippo(self,job):
        self.job = job
        
if __name__=='__main__':
    hum = Human()
    print("job:",hum.job)
    print("flagLife : ",hum.flagLife)
    hum.die()
    hum.chippo("CEO")
    print("job:",hum.job)
    print("flagLife : ",hum.flagLife)
