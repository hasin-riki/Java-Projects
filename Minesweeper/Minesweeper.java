//Hasin Zaman
//23010
import java.util.Scanner;
public class Minesweeper{	

public static void main(String[] args){

	Scanner obj=new Scanner(System.in);
	
	System.out.println("Welcome to Minesweeper!");
	System.out.println("Choose size of grid (Press 1 for 5x5, else Press any number for 10x10)");
	
	int size=obj.nextInt();
	int rows=0,columns=0;
	int bombs=0,correctguesses=0;
	
	if(size==1){
	rows=5;columns=5;}
	else{
	rows=10;columns=10;}
	
	int[][] grid=new int[rows][columns];
	String[][] display=new String[rows][columns];

	for(int i=0;i<rows;i++){
	for(int j=0;j<columns;j++){
	display[i][j]=" ";}}

	for(int i=0;i<rows;i++){
	for(int j=0;j<columns;j++){
	grid[i][j]=(int)(Math.random()*2);
	if(grid[i][j]==1){
	bombs++;}}}

	while(true){
	int count=0;
	try{
	System.out.println("Enter row of the cell you want to open");
	int inputrow=obj.nextInt();
	System.out.println("Enter column of the cell you want to open");
	int inputcol=obj.nextInt();
	
	if(grid[inputrow][inputcol]==1){
	for(int i=0;i<rows;i++){
	for(int j=0;j<columns;j++){
	if(grid[i][j]==1){
	display[i][j]="X";}}}
	
	for(int i=0;i<rows;i++){
	for(int j=0;j<columns;j++){
	System.out.print(display[i][j] + " ");}
	System.out.println();}
	System.out.println();

	System.out.println("Ooppps! You stepped on a bomb. Sorry, game over!");
	break;}

	else{
	correctguesses++;
	
	if((inputrow-1)<0){}
	else if(grid[inputrow-1][inputcol]==1){
	count++;}
	
	if((inputrow-1)<0 || (inputcol+1)>(grid.length-1)){}
	else if(grid[inputrow-1][inputcol+1]==1){
	count++;}
	
	if((inputrow-1)<0 || (inputcol-1)<0){}
	else if(grid[inputrow-1][inputcol-1]==1){
	count++;}
	
	if((inputcol+1)>(grid.length-1)){}
	else if(grid[inputrow][inputcol+1]==1){
	count++;}
	
	if((inputcol-1)<0){}
	else if(grid[inputrow][inputcol-1]==1){
	count++;}

	if((inputrow+1)>(grid.length-1)){}
	else if(grid[inputrow+1][inputcol]==1){
	count++;}

	if((inputrow+1)>(grid.length-1) || (inputcol+1)>(grid.length-1)){}
	else if(grid[inputrow+1][inputcol+1]==1){
	count++;}

	if((inputrow+1)>(grid.length-1) || (inputcol-1)<0){}
	else if(grid[inputrow+1][inputcol-1]==1){
	count++;}
	
	display[inputrow][inputcol]="" + count;
	for(int i=0;i<rows;i++){
	for(int j=0;j<columns;j++){
	System.out.print(display[i][j] + " ");}
	System.out.println();}
	System.out.println();}}

	catch(ArrayIndexOutOfBoundsException e){
	System.out.println("Incorrect row and/or col values entered (Range of values to be entered is from 0 to " + (grid.length-1) + ")");}
	
	if(correctguesses==(rows*columns)-bombs){
	for(int i=0;i<rows;i++){
	for(int j=0;j<columns;j++){
	if(grid[i][j]==1){
	display[i][j]="X";}}}

	System.out.println("Congratulations!! You have won the game");
	
	for(int i=0;i<rows;i++){
	for(int j=0;j<columns;j++){
	System.out.print(display[i][j] + " ");}
	System.out.println();}
	System.out.println();
	break;}}
	
}

}
	