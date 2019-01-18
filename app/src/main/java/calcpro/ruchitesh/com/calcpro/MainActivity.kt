package calcpro.ruchitesh.com.calcpro
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import calcpro.ruchitesh.com.calcpro.R.id.pls
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
   
    var clr=false
    var op:Char?=null
    var ans:Double=0.0
    fun append(view:View)
    {
        var string=ds.text.toString()
    var btn=view as Button
        if(string=="0"||clr)
            string=""
        when(btn.id)
        {
            b0.id->
            {
                string+="0"

            }
            b1.id->
            {
                string+="1"

            }
            b2.id->
            {
                string+="2"

            }
            b3.id->
            {
                string+="3"

            }
            b4.id->
            {
                string+="4"

            }
            b5.id->
            {
                string+="5"

            }
            b6.id->
            {
                string+="6"

            }
            b7.id->
            {
                string+="7"

            }
            b8.id->
            {
                string+="8"

            }
            b9.id->
            {
                string+="9"

            }
            ac.id->{
                string="0"
            }
            dot.id->
            {
                string=ds.text.toString()
                if(!string.contains("."))
                    string+="."

            }
            plsmins.id->
            {
                string=ds.text.toString()
                if(string=="")
                    string="0"
                if(string[0]=='-')
                    string=string.substring(1)
                else if(string!="0")
                    string="-"+string
            }
            del.id->
            {
                string=ds.text.toString()
                if(string=="")
                    string="0"
                else
                {
                    string=string.substring(0,string.count()-1)
                    if(string=="")
                        string="0"
                }
            }
        }
       
        ds.text=string
        clr=false


    }
    fun evalute(view:View) {
        if(op==null||clr==true)
        {
            try {
                ans=ds.text.toString().toDouble()
            }catch (ex:Exception)
            {

            }

        }
        else
        {
            when(op)
            {
                '+'->ans+=ds.text.toString().toDouble()
                '-'->ans-=ds.text.toString().toDouble()
                '*'->ans*=ds.text.toString().toDouble()
                '/'->ans/=ds.text.toString().toDouble()
            }
        }
        clr=true

      var btn=view as Button
        when(btn.id)
        {
            pls.id->
                    op='+'
            mul.id->
                op='*'
            div.id->
                op='/'
            mins.id->
                op='-'
            eql.id-> {
                op=null
                ds.text = ans.toString()
                ans=0.0
            }
        }
       
    }

   


    }
