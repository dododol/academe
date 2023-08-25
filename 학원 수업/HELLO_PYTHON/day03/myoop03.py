class computer:
    def __init__(self):
        self.flagOn = False
        print("생성자")
    def power(self):
        self.flagOn = True
    def __del__(self):
        print("소멸자")    
    def __str__(self):
        return "컴퓨터 : {}".format(self.flagOn);
    
            
            
if __name__== '__main__':
    com = computer()
    print("flagOn",com.flagOn)
    com.power()
    print("flagOn",com.flagOn)