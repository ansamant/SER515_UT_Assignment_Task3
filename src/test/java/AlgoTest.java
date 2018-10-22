package test.java;

import static org.junit.Assert.*;
import java.util.Arrays;

import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;

public class AlgoTest {
	// test Arrays of Item type to be used in All test cases for all methods
	Item [] nodeArray = {new Item(1), new Item(9), new Item(8),new Item(3), new Item(2),
			             new Item(5), new Item(4), new Item(6), new Item(7), new Item(0)};
	Item[] sortedNodeArray = {new Item(0), new Item(1), new Item(2), new Item(3), new Item(4),
							  new Item(5), new Item(6), new Item(7), new Item(8), new Item(9)};
	Item[] nullArr = null;
	Item[] singleArr = {new Item(1)};
	Item[] sortedArr= {new Item(1), new Item(2)};
	//For mergeSort and onwards
	Item [] quintArr = {new Item(1), new Item(2), new Item(3), new Item(4), new Item(5)};
	
	// Test Cases for Bubble Sort
	
	
	/**
	 * Node Coverage test for bubble sort 
	 * also serves as final conditional coverage since the final conditional coverage case uses same array
	 * This also covers branch coverages full case
	 * */
	@Test
	public void bubbleNodeTest() throws Exception{
		assertNotNull("... To have node coverage the array cannot be null", nodeArray);
		assertTrue("... To have node coverage array must have more than one element", nodeArray.length > 1);
		assertFalse("... Initially the array is not sorted", Arrays.equals(nodeArray, sortedNodeArray));
		//assertArrayEquals method and Arrays.equals methods were failing as such this was the only way to fix this.
		Item[] sortedBubbleArr = SortAlgos.bubbleSort(nodeArray);
		for (int i = 0; i < nodeArray.length; i++) {
			assertTrue("...These elements are equal", sortedBubbleArr[i].key == sortedNodeArray[i].key);
		}
		
		
		
	}
	/**
	 * Edge Coverage for bubble Sort
	 * All edge coverage cases save for exception
	 * */
	// Remainder of the tests for edge coverage
	@Test
	public void bubbleEdgeTest() throws Exception{
		//Branch where only the first for loop is checked and the code does not go further
		assertTrue("... Only one element",singleArr.length == 1);
		assertTrue("... When only one element is present the array is already sorted", Arrays.equals(singleArr, SortAlgos.bubbleSort(singleArr)));
		
		//Branch where the for loops are called but not the nested if conditional Also works for second conditional coverage requirement
		assertTrue("... An already sorted array cannot call forth the nested if statement", Arrays.equals(sortedArr, SortAlgos.bubbleSort(sortedArr)));
		
	}
	
	
	/**
	 * Conditional Coverage for bubble sort
	 * For the first if statement coverage this was used as reference: https://junit.org/junit4/faq.html#atests_7
	 * 
	 * */
	// Test for Null case for condition coverage of the null if statement
		@Test (expected = NullPointerException.class)
		public void bubbleCondtionTestNullPointerException() throws Exception{
			SortAlgos.bubbleSort(nullArr);
		}
	
	// Selection Sort test coverage:
		
		/**
		 * Node Coverage test for selection sort 
		 * also serves as final conditional coverage since the final conditional coverage case uses same array
		 * */
		@Test
		public void selectionNodeTest() throws Exception{
			assertNotNull("... To have node coverage the array cannot be null", nodeArray);
			assertTrue("... To have node coverage array must have more than one element", nodeArray.length > 1);
			assertFalse("... Initially the array is not sorted", Arrays.equals(nodeArray, sortedNodeArray));
			//assertArrayEquals method and Arrays.equals methods were failing as such this was the only way to fix this.
			Item[] sortedSelectArr = SortAlgos.selectionSort(nodeArray);
			for (int i = 0; i < nodeArray.length; i++) {
				assertTrue("...These elements are equal", sortedSelectArr[i].key == sortedNodeArray[i].key);
			}
			
			
			
		}
		/**
		 * Edge Coverage for selection Sort
		 * 
		 * */
		// Remainder of the tests for edge coverage
		@Test
		public void selectionEdgeTest() throws Exception{
			//Branch where only the first for loop is checked and the code does not go further
			assertTrue("... Only one element",singleArr.length == 1);
			assertTrue("... When only one element is present the array is already sorted", Arrays.equals(singleArr, SortAlgos.selectionSort(singleArr)));
			
			//Branch where the for loops are called but not the nested if conditional Also works for second conditional coverage requirement
			assertTrue("... An already sorted array cannot call forth the nested if statement", Arrays.equals(sortedArr, SortAlgos.selectionSort(sortedArr)));
			
		}
		
		
		/**
		 * Conditional Coverage for selection sort
		 * For the first if statement coverage this was used as reference: https://junit.org/junit4/faq.html#atests_7
		 * 
		 * */
		// Test for Null case for condition coverage of the null if statement
			@Test (expected = NullPointerException.class)
			public void selectionCondtionTestNullPointerException() throws Exception{
				SortAlgos.selectionSort(nullArr);
			}
			
		// Insertion Sort Code Coverage
			
			/**
			 * Node Coverage test for selection sort 
			 * also serves as final conditional coverage since the final conditional coverage case uses same array
			 * */
			@Test
			public void insertionNodeTest() throws Exception{
				assertNotNull("... To have node coverage the array cannot be null", nodeArray);
				assertTrue("... To have node coverage array must have more than one element", nodeArray.length > 1);
				assertFalse("... Initially the array is not sorted", Arrays.equals(nodeArray, sortedNodeArray));
				//assertArrayEquals method and Arrays.equals methods were failing as such this was the only way to fix this.
				Item[] sortedInsertedArr = SortAlgos.insertionSort(nodeArray);
				for (int i = 0; i < nodeArray.length; i++) {
					assertTrue("...These elements are equal", sortedInsertedArr[i].key == sortedNodeArray[i].key);
				}
				
				
				
			}
			/**
			 * Edge Coverage for insertion Sort
			 * 
			 * */
			
			// Remainder of the tests for edge coverage
			@Test
			public void insertionEdgeTest() throws Exception{
				//Branch where only the first for loop is checked and the code does not go further
				assertTrue("... Only one element",singleArr.length == 1);
				assertTrue("... When only one element is present the array is already sorted", Arrays.equals(singleArr, SortAlgos.insertionSort(singleArr)));
				
				//Branch where the for loops are called but not the nested if conditional Also works for second conditional coverage requirement
				assertTrue("... An already sorted array cannot call forth the nested if statement", Arrays.equals(sortedArr, SortAlgos.insertionSort(sortedArr)));
				
			}
			/**
			 * Conditional Coverage for insertion sort
			 * For the first if statement coverage this was used as reference: https://junit.org/junit4/faq.html#atests_7
			 * 
			 * */
			// Test for Null case for condition coverage of the null if statement
				@Test (expected = NullPointerException.class)
				public void insertionCondtionTestNullPointerException() throws Exception{
					SortAlgos.insertionSort(nullArr);
				}	
				
				//Merge Sort
				/**
				 * Node Coverage test for merge sort 
				 * also serves as final conditional coverage since the final conditional coverage case uses same array
				 * */
				@Test
				public void mergeNodeTest() throws Exception{
					assertNotNull("... To have node coverage the array cannot be null", nodeArray);
					assertTrue("... To have node coverage array must have at least more than 4 elements", nodeArray.length >4);
					assertFalse("... Initially the array is not sorted", Arrays.equals(nodeArray, sortedNodeArray));
					//assertArrayEquals method and Arrays.equals methods were failing as such this was the only way to fix this.
					Item[] sortedMergeArr = SortAlgos.mergeSort(nodeArray);
					for (int i = 0; i < nodeArray.length; i++) {
						assertTrue("...These elements are equal", sortedMergeArr[i].key == sortedNodeArray[i].key);
					}
					
					
					
				}
				/**
				 * Edge Coverage for merge Sort
				 * 
				 * */
				// Remainder of the tests for edge coverage
				@Test
				public void mergeEdgeTest() throws Exception{
					//Branch where only the first for loop is checked and the code does not go further
					assertTrue("... Only one element",singleArr.length == 1);
					assertTrue("... When only one element is present the array is already sorted", Arrays.equals(singleArr, SortAlgos.mergeSort(singleArr)));
					
					//Branch where the for loops are called but not the nested if conditional Also works for second conditional coverage requirement
					assertTrue("... An already sorted array cannot call forth the nested if statement", Arrays.equals(sortedArr, SortAlgos.mergeSort(sortedArr)));
					
					//Branch minimal where all things are checked
					assertTrue("... An already sorted array which uses some of the midpoint", Arrays.equals(quintArr, SortAlgos.mergeSort(quintArr)));
					
				}
				
				/**
				 * First Conditional check for merge sort
				 * 
				 * */
				
				// Test for Null case for condition coverage of the null if statement
				@Test (expected = NullPointerException.class)
				public void mergeCondtionTestNullPointerException() throws Exception{
					SortAlgos.mergeSort(nullArr);
				}
				
	// quickSort
				/**
				 * Node Coverage test for quick sort 
				 * also serves as final conditional coverage since the final conditional coverage case uses same array
				 * */
				@Test
				public void quickNodeTest() throws Exception{
					assertNotNull("... To have node coverage the array cannot be null", nodeArray);
					assertTrue("... To have node coverage array must have at least more than 4 elements", nodeArray.length >4); // for pivot
					assertFalse("... Initially the array is not sorted", Arrays.equals(nodeArray, sortedNodeArray));
					//assertArrayEquals method and Arrays.equals methods were failing as such this was the only way to fix this.
					Item[] sortedQuicklyArr = SortAlgos.quickSort(nodeArray);
					for (int i = 0; i < nodeArray.length; i++) {
						assertTrue("...These elements are equal", sortedQuicklyArr[i].key == sortedNodeArray[i].key);
					}
					
					
					
				}
				/**
				 * Edge Coverage for quick Sort
				 * 
				 * */
				// Remainder of the tests for edge coverage
				@Test
				public void quickEdgeTest() throws Exception{
					//Branch where only the first for loop is checked and the code does not go further
					assertTrue("... Only one element",singleArr.length == 1);
					assertTrue("... When only one element is present the array is already sorted", Arrays.equals(singleArr, SortAlgos.quickSort(singleArr)));
					
					//Branch where the for loops are called but not the nested if conditional Also works for second conditional coverage requirement
					assertTrue("... An already sorted array cannot call forth the nested if statement", Arrays.equals(sortedArr, SortAlgos.quickSort(sortedArr)));
					
					//Branch minimal where all things are checked
					assertTrue("... An already sorted array which uses some of the midpoint", Arrays.equals(quintArr, SortAlgos.quickSort(quintArr)));
					
				}
				
				/**
				 * First conditional check for quick sort
				 * */
				
				// Test for Null case for condition coverage of the null if statement
				@Test (expected = NullPointerException.class)
				public void quickCondtionTestNullPointerException() throws Exception{
					SortAlgos.quickSort(nullArr);
				}
				
				//Heap Sort:
				/**
				 * Node Coverage test for heap sort 
				 * also serves as final conditional coverage since the final conditional coverage case uses same array
				 * */
				@Test
				public void heapNodeTest() throws Exception{
					assertNotNull("... To have node coverage the array cannot be null", nodeArray);
					assertTrue("... To have node coverage array must have at least more than 4 elements", nodeArray.length >4); // for pivot
					assertFalse("... Initially the array is not sorted", Arrays.equals(nodeArray, sortedNodeArray));
					//assertArrayEquals method and Arrays.equals methods were failing as such this was the only way to fix this.
					Item[] sortedHeapArr = SortAlgos.heapSort(nodeArray);
					for (int i = 0; i < nodeArray.length; i++) {
						assertTrue("...These elements are equal", sortedHeapArr[i].key == sortedNodeArray[i].key);
					}
					
					
					
				}
				/**
				 * Edge Coverage for heap Sort
				 * 
				 * */
				// Remainder of the tests for edge coverage
				@Test
				public void heapEdgeTest() throws Exception{
					//Branch where only the first for loop is checked and the code does not go further
					assertTrue("... Only one element",singleArr.length == 1);
					assertTrue("... When only one element is present the array is already sorted", Arrays.equals(singleArr, SortAlgos.heapSort(singleArr)));
					
					//Branch where the for loops are called but not the nested if conditional Also works for second conditional coverage requirement
					assertTrue("... An already sorted array cannot call forth the nested if statement", Arrays.equals(sortedArr, SortAlgos.heapSort(sortedArr)));
					
					//Branch minimal where all things are checked
					assertTrue("... An already sorted array which uses some of the midpoint", Arrays.equals(quintArr, SortAlgos.heapSort(quintArr)));
					
				}
				
				/**
				 * First conditional test for heap sort
				 * */
				
				// Test for Null case for condition coverage of the null if statement
				@Test (expected = NullPointerException.class)
				public void heapCondtionTestNullPointerException() throws Exception{
					SortAlgos.heapSort(nullArr);
				}
	}
