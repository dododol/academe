import sys
from PyQt5 import uic, QtGui
from PyQt5.QtWidgets import QApplication, QMainWindow
from gevent.tests.test__events import event



form_class = uic.loadUiType("my_tetris01.ui")[0]

class MainClass(QMainWindow, form_class):
    def __init__(self) :
        QMainWindow.__init__(self)
        self.setupUi(self)
        self.show()
        
       # self.lbl.clicked.connect(self.myclick)
        self.lbl.mousePressEvent = self.myclick

    def myclick(self,event):
        self.pb.setIcon(QtGui.QIcon("1.png"))
        self.lbl.setPixmap(QtGui.QPixmap("1.png"))
        
        
        
if __name__ == "__main__" :
    app = QApplication(sys.argv) 
    window = MainClass() 
    app.exec_()
    