import sys
from PyQt5 import uic, QtGui
from PyQt5.QtGui import QPixmap, QIcon
from PyQt5.Qt import QPushButton, QMainWindow, QApplication
from PyQt5 import QtGui, QtCore
form_class = uic.loadUiType("omok01.ui")[0]

class MyWindow(QMainWindow, form_class):

    def __init__(self):
        QMainWindow.__init__(self)
        self.setupUi(self)
        self.arr= []
        
        for i in range(19):
            for j in range(19):
                lego = QPushButton('', self)
                lego.setIcon(QtGui.QIcon('0.png'))
                lego.setGeometry(i*40, j*40, 40, 40)
                lego.setIconSize(QtCore.QSize(40,40))
                lego.clicked.connect(self.myclick)            
                self.arr.append(lego)
        
        
        self.show()
        self.pb.clicked.connect(self.myclick)
        
    def myclick(self):
        self.sender().setIcon(QtGui.QIcon('1.png'))

if __name__ == "__main__":
    app= QApplication(sys.argv)
    window = MyWindow()
    app.exec_()