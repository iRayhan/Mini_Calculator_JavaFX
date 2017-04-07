package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;




public class Main extends Application {
	

    @FXML
    private Button acBtn;

    @FXML
    private TextField display;

    @FXML
    private Button oneBtn;
    
    
    @FXML
    private Button twoBtn;
    

    @FXML
    private Button threeBtn;

    @FXML
    private Button fourBtn;

    @FXML
    private Button fiveBtn;

    @FXML
    private Button sixBtn;

    @FXML
    private Button sevenBtn;

    @FXML
    private Button eightBtn;

    @FXML
    private Button nineBtn;

    @FXML
    private Button doubleZeroBtn;

    @FXML
    private Button zeroBtn;

    @FXML
    private Button pointBtn;


    @FXML
    private Button plusBtn;

    
    @FXML
    private Button minusBtn;
    
    
    @FXML
    private Button percentBtn;

    @FXML
    private Button factorialBtn;
    
    

    @FXML
    private Button eqlBtn;
    
    @FXML
    private Button multyBtn;

    @FXML
    private Button divisionBtn;
    
    
    
    @FXML
    private Button clearBtn;
    
    

    @FXML
    private Button offBtn;
    
    
    
    
    
    
    String number;
    String operator;
    
    Integer nmbrStartPoint;
    Integer nmbrCounter;
    
    Button lastOprtr;
    String temp;
    
    double[] digit = new double[50];
    double result;
    
    double[] resultArray = new double[50];
    int[] nmbrStartPointArray = new int[50];
    
    Boolean startMinus;

    
    
    
    public void initialize(){
    	
    	number = "";
    	operator = "";
    		
    	temp = "";
    	
    	result = 0;
    	
    	nmbrStartPoint = 0;
    	
    	nmbrCounter = 0;
    	
    	nmbrStartPointArray[0] = 0;
    	resultArray[0] = 0;

    	
    	lastOprtr = plusBtn;
    	
    	startMinus = false;
    }
    
    
    
    
    
    
    
    
    
    
    @FXML
    private void getNumber(ActionEvent event) {
    	
    	if(event.getSource().equals(oneBtn)){
    		
    		number = number + oneBtn.getText();
    		display.setText(number);

    	}
    	
    	else if(event.getSource().equals(twoBtn)){
			
    		number = number + twoBtn.getText();
    		display.setText(number);
    		
		}
    	
    	
    	else if(event.getSource().equals(threeBtn)){
			
    		number = number + threeBtn.getText();
    		display.setText(number);
    		
		}
    	
    	else if(event.getSource().equals(fourBtn)){
			
    		number = number + fourBtn.getText();
    		display.setText(number);
    		
		}
    	
    	else if(event.getSource().equals(fiveBtn)){
			
    		number = number + fiveBtn.getText();
    		display.setText(number);
    		
		}
    	
    	
    	else if(event.getSource().equals(sixBtn)){
			
    		number = number + sixBtn.getText();
    		display.setText(number);
    		
		}
    	
    	
    	else if(event.getSource().equals(sevenBtn)){
			
    		number = number + sevenBtn.getText();
    		display.setText(number);
    		
		}
    	
    	
    	else if(event.getSource().equals(eightBtn)){
			
    		number = number + eightBtn.getText();
    		display.setText(number);
    		
		}
    	
    	
    	else if(event.getSource().equals(nineBtn)){
			
    		number = number + nineBtn.getText();
    		display.setText(number);
    		
		}
    	
    	
    	
    	else if(event.getSource().equals(doubleZeroBtn)){
			
    		number = number + doubleZeroBtn.getText();
    		display.setText(number);
    		
		}
    	
    	
    	else if(event.getSource().equals(zeroBtn)){
			
    		number = number + zeroBtn.getText();
    		display.setText(number);
    		
		}
    	
    	
    	else if(event.getSource().equals(pointBtn)){
			
    		number = number + pointBtn.getText();
    		display.setText(number);
    		
		}
    	
    	

    }
    
    
    
    
    
    

    @FXML
    private void getOperator(ActionEvent event) {
    	
    	if(event.getSource().equals(plusBtn)){
    		
    		try {
    			
    			if(number.length() == 0){
    				
        			number = number + plusBtn.getText();
            		display.setText(number);
    			}
    			else if(lastOprtr.equals(factorialBtn) || lastOprtr.equals(percentBtn)){
    				display.setText(number);
    			}
    			
    			else{
    				
    				temp = number + plusBtn.getText();
    				
            		
            		if(!temp.substring(temp.length()-1).equals(temp.substring(temp.length()-2, temp.length()-1))){
        				
        				nmbrCounter++;
        				
                		digit[nmbrCounter] = Double.parseDouble(number.substring(nmbrStartPoint, number.length())); 
            			nmbrStartPoint = number.length()+1;
            			
            			number = number + plusBtn.getText();
            			
            			
                		
                		display.setText(number);
                		
                		
                		
                		
                		if(lastOprtr.equals(plusBtn)){
                			result = result + digit[nmbrCounter];	
                		}
                		else if(lastOprtr.equals(minusBtn) && startMinus == true){
                			
                			result = 1 * digit[nmbrCounter];
                			startMinus = false;
                			
                		}
                		else if(lastOprtr.equals(minusBtn) && startMinus == false){
                			
                			result = result - digit[nmbrCounter];
                		}
                		else if(lastOprtr.equals(multyBtn)){
                			
                			result = result * digit[nmbrCounter];
                		}
                		else if(lastOprtr.equals(divisionBtn)){
                			
                			result = result / digit[nmbrCounter];
                		}

                		
                		lastOprtr = plusBtn;
                		resultArray[nmbrCounter] = result;
                		nmbrStartPointArray[nmbrCounter] = nmbrStartPoint;
            		}

    			}	
        		
        		
			} catch (Exception e) {
				

        		
				display.setText("Syntax Error");

			}
    	}
    	
    	
    	
    	
    	else if(event.getSource().equals(minusBtn)){
    		
    		try {
    			
    			
    			
    			if(number.length() == 0){
    				
    				lastOprtr = minusBtn;
    				
            		number = number + minusBtn.getText();
            		display.setText(number);
            		
            		startMinus = true;
    			}
    			
    			else if(lastOprtr.equals(factorialBtn) || lastOprtr.equals(percentBtn)){
    				display.setText(number);
    			}
    			
    			else{
    				
    				temp = number + minusBtn.getText();
    				
    				if(!temp.substring(temp.length()-1).equals(temp.substring(temp.length()-2, temp.length()-1))){
        				
        				nmbrCounter++;
        				
        				digit[nmbrCounter] = Double.parseDouble(number.substring(nmbrStartPoint, number.length()));

                		
                		if(lastOprtr.equals(plusBtn)){
                			
                			result = result + digit[nmbrCounter];      			
                		}
                		else if(lastOprtr.equals(minusBtn) && startMinus == true){
                			
                			result = 1 * digit[nmbrCounter];
                			startMinus = false;
                			
                		}
                		else if(lastOprtr.equals(minusBtn) && startMinus == false){
                			
                			result = result - digit[nmbrCounter];
                		}
                		else if(lastOprtr.equals(multyBtn)){
                			
                			result = result * digit[nmbrCounter];
                		}
                		else if(lastOprtr.equals(divisionBtn)){
                			
                			result = result / digit[nmbrCounter];
                		}
                		

        				
        				
            			nmbrStartPoint = number.length()+1;
            			
                		number = number + minusBtn.getText();
                		display.setText(number);

                		
                		lastOprtr = minusBtn;
                		
                		resultArray[nmbrCounter] = result;
                		nmbrStartPointArray[nmbrCounter] = nmbrStartPoint;
    				}
    				

            		
            		
    			}
        		
        		
			} catch (Exception e) {
	    		
				display.setText("Syntax Error");
			}
    	}
    	
    	
    	
    	else if(event.getSource().equals(multyBtn)){
    		
    		try {
    			
    			if(number.length() == 0){
    				
        			number = number + multyBtn.getText();
            		display.setText(number);
    			}
    			else if(lastOprtr.equals(factorialBtn) || lastOprtr.equals(percentBtn)){
    				display.setText(number);
    			}
    			else{
    				
    				temp = number + multyBtn.getText();
        			
        			if(!temp.substring(temp.length()-1).equals(temp.substring(temp.length()-2, temp.length()-1))){
        				
            			nmbrCounter++;

                		digit[nmbrCounter] = Double.parseDouble(number.substring(nmbrStartPoint, number.length())); 
                		
                				
            			
            			nmbrStartPoint = number.length()+1;
            			
                		number = number + multyBtn.getText();
                		display.setText(number);
                		
                		if(lastOprtr.equals(plusBtn)){
                			
                			result = result + digit[nmbrCounter];      			
                		}
                		else if(lastOprtr.equals(minusBtn) && startMinus == true){
                			
                			result = 1 * digit[nmbrCounter];
                			startMinus = false;
                			
                		}
                		else if(lastOprtr.equals(minusBtn) && startMinus == false){
                			
                			result = result - digit[nmbrCounter];
                		}
                		else if(lastOprtr.equals(multyBtn)){
                			
                			result = result * digit[nmbrCounter];
                		}
                		else if(lastOprtr.equals(divisionBtn)){
                			
                			result = result / digit[nmbrCounter];
                		}

                		
                		lastOprtr = multyBtn;
                		
                		resultArray[nmbrCounter] = result;
                		nmbrStartPointArray[nmbrCounter] = nmbrStartPoint;
        			}
        			

    			}
    			
    			
        		
			} catch (Exception e) {
	    		
				display.setText("Syntax Error");
			}
    	}
    	
    	
    	
    	else if(event.getSource().equals(divisionBtn)){
    		
    		try {
    			
    			if(number.length() == 0){
    				
        			number = number + divisionBtn.getText();
            		display.setText(number);
    			}
    			else if(lastOprtr.equals(factorialBtn) || lastOprtr.equals(percentBtn)){
    				display.setText(number);
    			}
    			else{
    				temp = number + divisionBtn.getText();
        			
        			if(!temp.substring(temp.length()-1).equals(temp.substring(temp.length()-2, temp.length()-1))){
        				
            			nmbrCounter++;

                		digit[nmbrCounter] = Double.parseDouble(number.substring(nmbrStartPoint, number.length())); 
                		
                				
            			
            			nmbrStartPoint = number.length()+1;
            			
                		number = number + divisionBtn.getText();
                		display.setText(number);
                		
                		
                		if(lastOprtr.equals(plusBtn)){
                			
                			result = result + digit[nmbrCounter];      			
                		}
                		else if(lastOprtr.equals(minusBtn) && startMinus == true){
                			
                			result = 1 * digit[nmbrCounter];
                			startMinus = false;
                			
                		}
                		else if(lastOprtr.equals(minusBtn) && startMinus == false){
                			
                			result = result - digit[nmbrCounter];
                		}
                		else if(lastOprtr.equals(multyBtn)){
                			
                			result = result * digit[nmbrCounter];
                		}
                		else if(lastOprtr.equals(divisionBtn)){
                			
                			result = result / digit[nmbrCounter];
                		}

                		
                		
                		lastOprtr = divisionBtn;
                		
                		resultArray[nmbrCounter] = result;
                		nmbrStartPointArray[nmbrCounter] = nmbrStartPoint;
        			}
        			

    			}
    			
    			
        		
        		
			} catch (Exception e) {
				display.setText("Syntax Error");
			}
    	}
    	
    	
    	else if(event.getSource().equals(percentBtn)){
    		
    		try {
    			
    			if(number.length() == 0){
    				
        			number = number + percentBtn.getText();
            		display.setText(number);
    			}
    			else if(lastOprtr.equals(factorialBtn) || lastOprtr.equals(percentBtn)){
    				display.setText(number);
    			}
    			
    			else{
    				
        			temp = number + percentBtn.getText();
        			
        			if(!temp.substring(temp.length()-1).equals(temp.substring(temp.length()-2, temp.length()-1))){
                		

            			nmbrCounter++;

                		digit[nmbrCounter] = Double.parseDouble(number.substring(nmbrStartPoint, number.length())); 
                		
                		nmbrStartPoint = number.length()+1;
                		
                		if(lastOprtr.equals(plusBtn)){
                			
                			result = result + digit[nmbrCounter];      			
                		}
                		else if(lastOprtr.equals(minusBtn) && startMinus == true){
                			
                			result = 1 * digit[nmbrCounter];
                			startMinus = false;
                			
                		}
                		else if(lastOprtr.equals(minusBtn) && startMinus == false){
                			
                			result = result - digit[nmbrCounter];
                		}
                		else if(lastOprtr.equals(multyBtn)){
                			
                			result = result * digit[nmbrCounter];
                		}
                		else if(lastOprtr.equals(divisionBtn)){
                			
                			result = result / digit[nmbrCounter];
                		}
                		
                		lastOprtr = percentBtn;
            			
                		number = number + percentBtn.getText();
                		display.setText(number);
                		
        			}
        			
    			}
    			


        		
        		
			} catch (Exception e) {
	    		
				display.setText("Syntax Error");
			}
    	}
    	
    	
    	else if(event.getSource().equals(factorialBtn)){
    		
    		try {
    			
    			if(number.length() == 0){
    				
        			number = number + factorialBtn.getText();
            		display.setText(number);
    			}
    			else if(lastOprtr.equals(factorialBtn) || lastOprtr.equals(percentBtn)){
    				display.setText(number);
    			}
    			else{
    				
        			temp = number + factorialBtn.getText();
        			
        			if(!temp.substring(temp.length()-1).equals(temp.substring(temp.length()-2, temp.length()-1))){
        				
                		
            			nmbrCounter++;

                		digit[nmbrCounter] = Double.parseDouble(number.substring(nmbrStartPoint, number.length())); 
                		
                		
                		nmbrStartPoint = number.length()+1;
                		
                		if(lastOprtr.equals(plusBtn)){
                			
                			result = result + digit[nmbrCounter];      			
                		}
                		else if(lastOprtr.equals(minusBtn) && startMinus == true){
                			
                			result = 1 * digit[nmbrCounter];
                			startMinus = false;
                			
                		}
                		else if(lastOprtr.equals(minusBtn) && startMinus == false){
                			
                			result = result - digit[nmbrCounter];
                		}
                		else if(lastOprtr.equals(multyBtn)){
                			
                			result = result * digit[nmbrCounter];
                		}
                		else if(lastOprtr.equals(divisionBtn)){
                			
                			result = result / digit[nmbrCounter];
                		}
                		
                		lastOprtr = factorialBtn;
            			
                		number = number + factorialBtn.getText();
                		display.setText(number);

        			}
        			

    			}
    			
    			

        		
        		
			} catch (Exception e) {
	    		
				display.setText("Syntax Error");
			}
    	}
    	
    	else if(event.getSource().equals(acBtn)){
    		
    		number = "";
    		
        	temp = "";
        	
        	result = 0;
        	
        	nmbrStartPoint = 0;
        	
        	nmbrCounter = 0;
        	
        	nmbrStartPointArray[0] = 0;
        	resultArray[0] = 0;

        	
        	lastOprtr = plusBtn;
        	
        	startMinus = false;
        	
        	display.setText(number);
    	}
    	
    	else{
    		System.exit(0);
    	}
    	

    }
    
   
    
    
    

    @FXML
    private void getResult(ActionEvent event) {
    	
    	try {
    		
    		int integer = 0;
    		boolean isDouble = true;
    		
    		
    		
    		if(!lastOprtr.equals(percentBtn) && !lastOprtr.equals(factorialBtn)){
    			nmbrCounter++;
    			digit[nmbrCounter] = Double.parseDouble(number.substring(nmbrStartPoint, number.length()));
    		}

			
    		
    		
    		if(lastOprtr.equals(plusBtn)){
    			
    			
    			result = result + digit[nmbrCounter];
    			
    			if(result % 1 == 0){
    				
    				integer = (int) result;
    				
    				display.setText(integer+"");
    				
    				isDouble = false;
    				
    			}
    			else{
    				display.setText(result+"");
    			}
    			
    			
    			
    		}
    		
    		
    		else if(lastOprtr.equals(minusBtn)){
    			
    			
    			result = result - digit[nmbrCounter];
    			
    			if(result % 1 == 0){
    				
    				integer = (int) result;
    				
    				display.setText(integer+"");
    				
    				isDouble = false;
    				
    			}
    			else{
    				
    				display.setText(result+"");
    			}
    			
    			
    		}
    		
    		else if(lastOprtr.equals(multyBtn)){
    			
    			
    			result = result * digit[nmbrCounter];
    			
    			if(result % 1 == 0){
    				
    				integer = (int) result;
    				
    				display.setText(integer+"");
    				
    				isDouble = false;
    				
    			}
    			else{
    				
    				display.setText(result+"");
    			}
    			
    			
    		}
    		else if(lastOprtr.equals(divisionBtn)){
    			
    			
    			result = result / digit[nmbrCounter];
    			
    			if(result % 1 == 0){
    				
    				integer = (int) result;
    				
    				display.setText(integer+"");
    				
    				isDouble = false;
    				
    			}
    			else{
    				
    				display.setText(result+"");
    			}
    			
    			
    		}
    		else if(lastOprtr.equals(percentBtn)){
    			
    			
    			result = result / 100;
    			
    			if(result % 1 == 0){
    				
    				integer = (int) result;
    				
    				display.setText(integer+"");
    				
    				isDouble = false;
    				
    			}
    			else{
    				
    				display.setText(result+"");
    			}
    			
    			
    		}
    		else if(lastOprtr.equals(factorialBtn)){
    			
    			if(result >= 0){
    				
    				int factorial = 1;
    				
    				for(int f = 1; f <= result; f++){
    					
    					factorial = factorial * f;
    					
    				}
        			result = factorial;
        			
        			if(result % 1 == 0){
        				
        				integer = (int) result;
        				
        				display.setText(integer+"");
        				
        				isDouble = false;
        				
        			}
        			else{
        				
        				display.setText(result+"");
        			}
    			}
    			else {
					display.setText("Digit must be greater than or equal to 0");
				}
    			

    			
    			
    		}
        	
        	
        	
        	if(isDouble == false){
        		number = integer+"";
        	}
        	else {
        		number = result+"";
			}
        	
	    	nmbrStartPoint = 0;
	    	
	    	nmbrCounter = 0;
	    	
	    	result = 0;

        	lastOprtr = plusBtn;
        	

        	
        	resultArray[nmbrCounter] = result;
    		
		} catch (Exception e) {
			
	    	number = "";
	    	operator = "";
	    		
	    	temp = "";
	    	
	    	result = 0;
	    	
	    	nmbrStartPoint = 0;
	    	
	    	nmbrCounter = 0;
	    	
	    	nmbrStartPointArray[0] = 0;
	    	resultArray[0] = 0;

	    	
	    	lastOprtr = plusBtn;
	    	
	    	startMinus = false;
        	
			display.setText("Malformed Expression");
		}
    }
    
    
    
    
    
    
    
    
    @FXML
    private void remove(ActionEvent event) {
		try {
			
			
			if(number.endsWith(plusBtn.getText())){
	    		
        		nmbrCounter--;
	    		
	    		result = resultArray[nmbrCounter];
        		nmbrStartPoint = nmbrStartPointArray[nmbrCounter];
	    	}
	    	
	    	else if(number.endsWith(minusBtn.getText())){
	    		
        		nmbrCounter--;
	    		
	    		result = resultArray[nmbrCounter];
        		nmbrStartPoint = nmbrStartPointArray[nmbrCounter];
	    		
	    	}
	    	
	    	else if(number.endsWith(multyBtn.getText())){
	    		
        		nmbrCounter--;
	    		
	    		result = resultArray[nmbrCounter];
        		nmbrStartPoint = nmbrStartPointArray[nmbrCounter];
	    	}
	    	
	    	else if(number.endsWith(divisionBtn.getText())){
	    		
        		nmbrCounter--;
	    		
	    		result = resultArray[nmbrCounter];
        		nmbrStartPoint = nmbrStartPointArray[nmbrCounter];
	    	}
	    	else if(number.endsWith(percentBtn.getText())){
	    		
        		nmbrCounter--;
	    		
	    		result = resultArray[nmbrCounter];
        		nmbrStartPoint = nmbrStartPointArray[nmbrCounter];
	    	}
	    	else if(number.endsWith(factorialBtn.getText())){
	    		
        		nmbrCounter--;
	    		
	    		result = resultArray[nmbrCounter];
        		nmbrStartPoint = nmbrStartPointArray[nmbrCounter];
	    	}
	    	
	    	number = number.substring(0, number.length()-1);    	
	    	display.setText(number);
	    	
	    	
		} catch (Exception e) {
	    	number = "";
	    	operator = "";
	    		
	    	temp = "";
	    	
	    	result = 0;
	    	
	    	nmbrStartPoint = 0;
	    	
	    	nmbrCounter = 0;
	    	
	    	nmbrStartPointArray[0] = 0;
	    	resultArray[0] = 0;

	    	
	    	lastOprtr = plusBtn;
	    	
	    	startMinus = false;
			display.setText(number);
		}
    	
    	
	}
    
    
    
    
    
	
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Scene scene = new Scene(FXMLLoader.load(getClass().getResource("Scene.fxml")));
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());	
			primaryStage.resizableProperty().setValue(false);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
