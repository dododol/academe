using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace MyWin04
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btn1_Click(object sender, EventArgs e)
        {
            tb.AppendText("1");
        }

        private void btn2_Click(object sender, EventArgs e)
        {
            tb.AppendText("2");
        }

        private void btn3_Click(object sender, EventArgs e)
        {
            tb.AppendText("3");
        }

        private void btn4_Click(object sender, EventArgs e)
        {
            tb.AppendText("4");
        }

        private void btn5_Click(object sender, EventArgs e)
        {
            tb.AppendText("5");
        }

        private void btn6_Click(object sender, EventArgs e)
        {
            tb.AppendText("6");
        }

        private void btn7_Click(object sender, EventArgs e)
        {
            tb.AppendText("7");
        }

        private void btn8_Click(object sender, EventArgs e)
        {
            tb.AppendText("8");
        }

        private void btn9_Click(object sender, EventArgs e)
        {
            tb.AppendText("9");
        }

        private void btn0_Click(object sender, EventArgs e)
        {
            tb.AppendText("0");
        }

        private void btn_call_Click(object sender, EventArgs e)
        {
            String num = tb.Text;
            MessageBox.Show(num);
        }
    }
}