/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOSE F GALINDO
 */
/*************************************************************************************************************
 * TALLER SENAPARKING V1.0
 * AUTOR		:JOSE FERNANDO GALINDO SUAREZ
 * FECHA		:10/11/2021
 * DESCRIPCION	:FACTURACION DEL PARQUEADERO SENAPARKING
 * AA			:DISEÑAR Y APLICAR TECNICAS DE TESTING
 * TITULACION	:ANALISIS Y DESARROLLO DE SISTEMAS DE INFORMACION V102
 *************************************************************************************************************/
	import java.awt.*;
	import java.awt.event.*;
	 class ventana extends Frame implements ActionListener{
		 static TextField t1,t2,t3,t4;
		 static Button b1,b2; 
		 static Choice ch1,ch2;
		 static TextArea area;

		public void Muestra(){
		        Panel p1;
		        
		        this.setTitle("-SENA- CGMLTI - ADSI - SENAPARKING - FEGASU -2021");
		        setLayout(new FlowLayout());
		        p1 = new Panel(new GridLayout(7,2,12,16));
		        Label l1 = new Label("CLIENTE");
		        p1.add(l1);
		        
		        t1=new TextField("JOSE FERNANDO GALINDO SUAREZ");
		        
		        p1.add(t1);
		        Label l2 = new Label("PLACA");
		        p1.add(l2);
		        t4=new TextField("ICK123");
		        p1.add(t4);
		        
		        l1 = new Label("TIPO");
		        p1.add(l1);
		        ch1=new Choice();
		        ch1.add("AUTOMOVIL");
		        p1.add(ch1);
		        ch1.add("TAXI");
		        p1.add(ch1);
		        ch1.add("MOTOCICLETA");
		        p1.add(ch1);
		        ch1.add("BICICLETA");
		        p1.add(ch1);
		        
		        Label l1a = new Label("MODALIDAD");
		        p1.add(l1a);
		        ch2=new Choice();
		        ch2.add("AMANECER");
		        
		        ch2.add("SEMANA");
		        ch2.add("DIARIO");
		        ch2.add("HORAS");
		        p1.add(ch2);
		        l1 = new Label("HORAS");
		        p1.add(l1);
		        t2=new TextField("0");
		        p1.add(t2);
		        
		        
		        
		        b1=new Button("FACTURAR");
		        p1.add(b1);
		        b2=new Button("TERMINAR");
		        p1.add(b2);
		        Label l4 = new Label("");
		        p1.add(l4);
		         l1 = new Label("FACTURACION SENAPARKING");
		        p1.add(l1);
		        area=new TextArea();
		        area.setBounds(10,100,600,600);
		        add(p1);
		        add(area);
		        b1.addActionListener(this);
		        b2.addActionListener(this);
		        t2.addActionListener(this);
		 
		}
		public void Asignar(float[] x,float[] y){
		    x[0]=Float.parseFloat( t2.getText());
		    x[1]=Float.parseFloat( t3.getText());
		    x[2]=Float.parseFloat( t4.getText());
		    
		    y[0]=(float) (x[0]*0.2);
		    y[1]=(float) (x[1]*0.3);
		    y[2]=(float) (x[2]*0.5);

		}
		public Double ValorxHoraAuto(Double horas,String tipo, String modo) {
			Double hdtaxi=0.0;
			String aux="Modalidad:";
			if((tipo=="AUTO" || tipo=="TAXI") && modo=="NORMAL") {
				/*
				if(tipo=="AUTO")
			        return (horas * 2100.0);
				if(tipo=="TAXI")
			        return (horas * hdtaxi);
			    */
				return 1.0;
			}
			if((tipo=="AUTOMOVIL" || tipo=="TAXI") && modo=="SEMANA") {
				Double vtaxi=15000.0;
				if(tipo=="TAXI") {
				hdtaxi=vtaxi-vtaxi*0.02; 
				return hdtaxi;
				}
				if(tipo=="AUTOMOVIL") {
					hdtaxi=vtaxi; 
					return hdtaxi;
					}
			}
			if((tipo=="AUTOMOVIL"||tipo=="TAXI")  && modo=="AMANECER") {
				Double vtaxi=15000.0;
				if(tipo=="TAXI") {
				hdtaxi=vtaxi-vtaxi*0.02; 
				return hdtaxi;
				}
				if(tipo=="AUTOMOVIL") {
					hdtaxi=vtaxi; 
					return hdtaxi;
					}
			}
			if((tipo=="TAXI") && modo=="HORAS") {
				Double vtaxi=(2100.0*horas)-(2100.0*horas*0.02);	
				aux=aux+tipo+"\n";
				return vtaxi;
				
			}
			if((tipo=="TAXI") && modo=="DIARIO") {
				Double vtaxi=20000.0-(20000.0*0.02);	
				aux=aux+tipo+"\n";
				return vtaxi;
				
			}
			if((tipo=="AUTOMOVIL") && modo=="DIARIO") {
				Double vtaxi=20000.0-(20000.0*0.07);	
				aux=aux+tipo+"\n";
				return vtaxi;
				
			}
			if((tipo=="AUTOMOVIL") && modo=="SEMANA") {
				Double vtaxi=20000.0-(20000.0*0.07);	
				aux=aux+tipo+"\n";
				return vtaxi;
				
			}
			if((tipo=="TAXI") && modo=="SEMANA") {
				Double vtaxi=20000.0-(20000.0*0.07);	
				aux=aux+tipo+"\n";
				return vtaxi;
				
			}
			if((tipo=="AUTOMOVIL") && modo=="HORAS") {
				Double vtaxi=(2100.0*horas);	
				aux=aux+tipo+"\n";
				return vtaxi;
				
			}
			if(tipo=="MOTOCICLETA"  && modo=="HORAS") {
				Double vtaxi=(1200.0*horas);	
				aux=aux+tipo+"\n";
				return vtaxi;
				
			}
			if(tipo=="MOTOCICLETA"  && modo=="AMANECER") {
				Double vtaxi=(15000.0);	
				aux=aux+tipo+"\n";
				return vtaxi;
				
			}
			if(tipo=="MOTOCICLETA"  && modo=="DIARIO") {
				Double vtaxi=(15000.0);	
				aux=aux+tipo+"\n";
				return vtaxi;
				
			}
			if(tipo=="MOTOCICLETA"  && modo=="SEMANA") {
				Double vtaxi=(15000.0);	
				aux=aux+tipo+"\n";
				return vtaxi;
				
			}
			if(tipo=="BICICLETA"  && modo=="HORAS") {
				Double vtaxi=(450.0*horas);	
				aux=aux+tipo+"\n";
				return vtaxi;
				
			}
		return 0.0;
		}

		public void Validar(){
		    Double X,W=0.0;
		    Double Y=0.0;
		    Double Z=0.0;
		    area.setText("NO ESTA PERMITIDA LA MODALIDAD DE: "+ch2.getSelectedItem()+" PARA "+ch1.getSelectedItem());
		    if(t1.getText().equals("")){
		        area.setText("Ingrese nombre del cliente");
		        t1.requestFocus();
		        return;
		    }
		    if(t4.getText().equals("")){
		        area.setText("Ingrese la placa");
		        t4.requestFocus();
		        return;
		    }
		    if(!(Float.parseFloat( t2.getText())>0) && !((ch2.getSelectedItem().equals("AMANECER") || (ch2.getSelectedItem().equals("SEMANA"))|| (ch2.getSelectedItem().equals("DIARIO"))))){
		        area.setText("La hora debe ser mayor a 0");
		        //t2.setText("0");
		        t2.requestFocus();
		        return;
		    }
		    

		    X=this.ValorxHoraAuto(Double.parseDouble(t2.getText()),ch1.getSelectedItem(),ch2.getSelectedItem());
		    Y=X*0.16;
		    Z=X*0.84;
		    W=X*0.01;
		    
		    if((ch2.getSelectedItem()=="AMANECER" || ch2.getSelectedItem()=="SEMANA"|| ch2.getSelectedItem()=="DIARIO"|| ch2.getSelectedItem()=="HORAS"))
			if((ch1.getSelectedItem()=="AUTOMOVIL" || ch1.getSelectedItem()=="TAXI"|| ch1.getSelectedItem()=="MOTOCICLETA"))
		            area.setText("CLIENTE="+t1.getText()+"\nPLACA="+t4.getText()+"\nTIPO="+ch1.getSelectedItem()+"\nMODO="+ch2.getSelectedItem()+"\nHORAS="+t2.getText()+"\nVALOR="+Double.toString(X)+"\nIVA="+Double.toString(Y)+"\nNETO="+Double.toString(Z)+"\nIMPOVENTA="+Double.toString(W)+"\nTOTAL="+Double.toString(X+W));		    

		    if((ch2.getSelectedItem()=="HORAS"))
			      if((ch1.getSelectedItem()=="BICICLETA"))
		            area.setText("CLIENTE="+t1.getText()+"\nPLACA="+t4.getText()+"\nTIPO="+ch1.getSelectedItem()+"\nMODO="+ch2.getSelectedItem()+"\nHORAS="+t2.getText()+"\nVALOR="+Double.toString(X)+"\nIVA="+Double.toString(Y)+"\nNETO="+Double.toString(Z)+"\nIMPOVENTA="+Double.toString(W)+"\nTOTAL="+Double.toString(X+W));		    
		    
		}
		@Override
		public void actionPerformed (ActionEvent e){
		if (e.getSource() == b1){
		    Validar();
		}
		        if (e.getSource() == b2){
		          dispose();
		          System.exit(0);  
		        }
		}

		}

	public class SenaParking{
		public static void main(String[] args){		
		 ventana v=new ventana();
	        v.setSize(650, 550);
	        
	        v.Muestra();
	        //v.show();
	        
	       
	}

}
