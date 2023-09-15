import sys
from PyQt5 import uic, QtGui
from PyQt5.QtWidgets import QApplication, QMainWindow
from PyQt5.Qt import QPushButton, QSize, QMessageBox


form_class = uic.loadUiType("omok02.ui")[0]

class MainClass(QMainWindow, form_class):
    def __init__(self) :
        QMainWindow.__init__(self)
        self.setupUi(self)
        self.flag_wb = True
        self.arr2D = [
            [0,0,0,0,0, 0,0,0,0,0],
            [0,0,0,0,0, 0,0,0,0,0],
            [0,0,0,0,0, 0,0,0,0,0],
            [0,0,0,0,0, 0,0,0,0,0],
            [0,0,0,0,0, 0,0,0,0,0],
            
            [0,0,0,0,0, 0,0,0,0,0],
            [0,0,0,0,0, 0,0,0,0,0],
            [0,0,0,0,0, 0,0,0,0,0],
            [0,0,0,0,0, 0,0,0,0,0],
            [0,0,0,0,0, 0,0,0,0,0]
        ]
        self.l2D =[]

        
        for i in range(10):
            line = []
            for j in range(10):
                lego = QPushButton('', self)
                lego.setIcon(QtGui.QIcon('0.png'))
                lego.setToolTip("{},{}".format(i,j))
                lego.setGeometry(j*40, i*40, 40, 40)
                lego.setIconSize(QSize(40, 40))  
                lego.clicked.connect(self.myclick)
                line.append(lego)
            self.l2D.append(line)

        
        self.show()
        self.pb.clicked.connect(self.myclick)
        self.myrender()
        
        
    def myrender(self):
        for i in range(10):
            for j in range(10):
                if self.arr2D[i][j] == 0 :
                    self.l2D[i][j].setIcon(QtGui.QIcon('0.png'))
                if self.arr2D[i][j] == 1 :
                    self.l2D[i][j].setIcon(QtGui.QIcon('1.png'))
                if self.arr2D[i][j] == 2 :
                    self.l2D[i][j].setIcon(QtGui.QIcon('2.png'))

    def myclick(self):  
        str_ij = self.sender().toolTip()
        arr_ij = str_ij.split(",")
        i = int(arr_ij[0])
        j = int(arr_ij[1])
        
        if self.arr2D[i][j]>0:
            return
        
        stone = -1
        if self.flag_wb :
            self.arr2D[i][j]=1
            stone = 1
        else:
            self.arr2D[i][j]=2
            stone = 2
        
        up = self.getUP(i,j,stone)
        dw = self.getDW(i,j,stone)
        le = self.getLE(i,j,stone)
        ri = self.getRI(i,j,stone)
        
        ul = self.getUL(i,j,stone)
        ur = self.getUR(i,j,stone)
        dl = self.getDL(i,j,stone)
        dr = self.getDR(i,j,stone)
        
        d1 = up + dw + 1
        d2 = le + ri + 1
        d3 = ul + dr + 1
        d4 = ur + dl + 1
        
        if d1 == 5 or d2 == 5 or d3 == 5 or d4 == 5 :
            QMessageBox.about(self,'Calling',"Game Over")
        
            
        self.myrender()
        self.flag_wb = not self.flag_wb
        
        
    def getDR(self,i,j,stone):
        cnt = 0
        try:
            while True:
                i += +1
                j += +1
                if i <0 :
                    return cnt
                if j <0 :
                    return cnt
                if self.arr2D[i][j]==stone:
                    cnt += 1
                else :
                    return cnt 
        except:
            return cnt
        
    def getDL(self,i,j,stone):
        cnt = 0
        try:
            while True:
                i += +1
                j += -1
                if i <0 :
                    return cnt
                if j <0 :
                    return cnt
                if self.arr2D[i][j]==stone:
                    cnt += 1
                else :
                    return cnt 
        except:
            return cnt

    def getUR(self,i,j,stone):
        cnt = 0
        try:
            while True:
                i += -1
                j += +1
                if i <0 :
                    return cnt
                if j <0 :
                    return cnt
                if self.arr2D[i][j]==stone:
                    cnt += 1
                else :
                    return cnt 
        except:
            return cnt

    def getUL(self,i,j,stone):
        cnt = 0
        try:
            while True:
                i += -1
                j += -1
                if i <0 :
                    return cnt
                if j <0 :
                    return cnt
                if self.arr2D[i][j]==stone:
                    cnt += 1
                else :
                    return cnt 
        except:
            return cnt
        
    def getUP(self,i,j,stone):
        cnt = 0
        try:
            while True:
                i += -1
                if i <0 :
                    return cnt
                if j <0 :
                    return cnt
                if self.arr2D[i][j]==stone:
                    cnt += 1
                else :
                    return cnt 
        except:
            return cnt
            
    def getDW(self,i,j,stone):
        cnt = 0
        try:
            while True:
                i += +1
                if i <0 :
                    return cnt
                if j <0 :
                    return cnt
                if self.arr2D[i][j]==stone:
                    cnt += 1
                else :
                    return cnt 
        except:
            return cnt
        
    def getLE(self,i,j,stone):
        cnt = 0
        try:
            while True:
                j += -1
                if i <0 :
                    return cnt
                if j <0 :
                    return cnt
                if self.arr2D[i][j]==stone:
                    cnt += 1
                else :
                    return cnt 
        except:
            return cnt
        
        
    def getRI(self,i,j,stone):
        cnt = 0
        try:
            while True:
                j += +1
                if i <0 :
                    return cnt
                if j <0 :
                    return cnt
                if self.arr2D[i][j]==stone:
                    cnt += 1
                else :
                    return cnt 
        except:
            return cnt
        
        
if __name__ == "__main__" :
    app = QApplication(sys.argv) 
    window = MainClass() 
    app.exec_()