package burlap.assignment4.util;

import java.util.ArrayList;
import java.util.List;

public final class AnalysisAggregator {
	private static List<Integer> numIterations = new ArrayList<Integer>();
	private static List<Integer> stepsToFinishValueIteration = new ArrayList<Integer>();
	private static List<Integer> stepsToFinishPolicyIteration = new ArrayList<Integer>();
	private static List<Integer> stepsToFinishQLearning = new ArrayList<Integer>();
	
	private static List<Integer> millisecondsToFinishValueIteration = new ArrayList<Integer>();
	private static List<Integer> millisecondsToFinishPolicyIteration = new ArrayList<Integer>();
	private static List<Integer> millisecondsToFinishQLearning = new ArrayList<Integer>();

	private static List<Double> rewardSumValueIteration = new ArrayList<Double>();
	private static List<Double> rewardSumPolicyIteration = new ArrayList<Double>();
	private static List<Double> rewardSumQLearning = new ArrayList<Double>();
	
	public static void addNumberOfIterations(Integer numIterations1){
		numIterations.add(numIterations1);
	}
	public static void addStepsToFinishValueIteration(Integer stepsToFinishValueIteration1){
		stepsToFinishValueIteration.add(stepsToFinishValueIteration1);
	}
	public static void addStepsToFinishPolicyIteration(Integer stepsToFinishPolicyIteration1){
		stepsToFinishPolicyIteration.add(stepsToFinishPolicyIteration1);
	}
	public static void addStepsToFinishQLearning(Integer stepsToFinishQLearning1){
		stepsToFinishQLearning.add(stepsToFinishQLearning1);
	}
	public static void printValueIterationResults(){
		System.out.print("Value Iteration,");	
		printList(stepsToFinishValueIteration);
	}
	public static void printPolicyIterationResults(){
		System.out.print("Policy Iteration,");	
		printList(stepsToFinishPolicyIteration);
	}
	public static void printQLearningResults(){
		System.out.print("Q Learning,");	
		printList(stepsToFinishQLearning);
	}


	

	public static void addMillisecondsToFinishValueIteration(Integer millisecondsToFinishValueIteration1){
		millisecondsToFinishValueIteration.add(millisecondsToFinishValueIteration1);
	}
	public static void addMillisecondsToFinishPolicyIteration(Integer millisecondsToFinishPolicyIteration1){
		millisecondsToFinishPolicyIteration.add(millisecondsToFinishPolicyIteration1);
	}
	public static void addMillisecondsToFinishQLearning(Integer millisecondsToFinishQLearning1){
		millisecondsToFinishQLearning.add(millisecondsToFinishQLearning1);
	}
	public static void printValueIterationTimeResults(){
		System.out.print("Value Iteration,");	
		printList(millisecondsToFinishValueIteration);
	}
	public static void printPolicyIterationTimeResults(){
		System.out.print("Policy Iteration,");	
		printList(millisecondsToFinishPolicyIteration);
	}
	public static void printQLearningTimeResults(){
		System.out.print("Q Learning,");	
		printList(millisecondsToFinishQLearning);
	}

	public static void addRewardSumValueIteration(Double rewardSumValueIteration1) {
		rewardSumValueIteration.add(rewardSumValueIteration1);
	}
	public static void addRewardSumPolicyteration(Double rewardSumPolicyIteration1) {
		rewardSumPolicyIteration.add(rewardSumPolicyIteration1);
	}
	public static void addRewardSumQLearning(Double rewardSumQLearning1) {
		rewardSumQLearning.add(rewardSumQLearning1);
	}
	public static void printRewardSumValueIteration(){
		System.out.print("Value Iteration,");
		printDoubleList(rewardSumValueIteration);
	}
	public static void printRewardSumPolicyIteration(){
		System.out.print("Policy Iteration,");
		printDoubleList(rewardSumPolicyIteration);
	}
	public static void printRewardSumQLearning(){
		System.out.print("Q Learning,");
		printDoubleList(rewardSumQLearning);
	}


	public static void printNumIterations(){
		System.out.print("Iterations,");	
		printList(numIterations);
	}
	private static void printList(List<Integer> valueList){
		int counter = 0;
		for(int value : valueList){
			System.out.print(String.valueOf(value));
			if(counter != valueList.size()-1){
				System.out.print(",");
			}
			counter++;
		}
		System.out.println();
	}
	private static void printDoubleList(List<Double> valueList){
		int counter = 0;
		for(Double value : valueList){
			System.out.print(String.valueOf(value));
			if(counter != valueList.size()-1){
				System.out.print(",");
			}
			counter++;
		}
		System.out.println();
	}
	public static void printAggregateAnalysis(){
		System.out.println("//Aggregate Analysis//\n");
		System.out.println("The data below shows the number of steps/actions the agent required to reach \n"
				+ "the terminal state given the number of iterations the algorithm was run.");
		printNumIterations();
		printValueIterationResults();
		printPolicyIterationResults();
		printQLearningResults();
		System.out.println();
		System.out.println("The data below shows the number of milliseconds the algorithm required to generate \n"
				+ "the optimal policy given the number of iterations the algorithm was run.");
		printNumIterations();
		printValueIterationTimeResults();
		printPolicyIterationTimeResults();
		printQLearningTimeResults();

		System.out.println();
		System.out.println("The data below shows the total rewards collected for the agent at the end of a given run");
		printNumIterations();
		printRewardSumValueIteration();
		printRewardSumPolicyIteration();
		printRewardSumQLearning();
	}
}
