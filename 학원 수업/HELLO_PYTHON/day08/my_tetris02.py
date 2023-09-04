import sys
from PyQt5 import uic, QtGui
from PyQt5.QtWidgets import QApplication, QMainWindow, QLabel



form_class = uic.loadUiType("my_tetris02.ui")[0]

class MainClass(QMainWindow, form_class):
    def __init__(self) :
        QMainWindow.__init__(self)
        self.setupUi(self)
        
        for j in range(10):
            for i in range(10):
                lbl = QLabel(self)
                lbl.setPixmap(QtGui.QPixmap("0.png"))
                lbl.setGeometry(j*40, i*40, 40, 40)
            
        self.show()
        
if __name__ == "__main__" :
    app = QApplication(sys.argv) 
    window = MainClass() 
    app.exec_()
    