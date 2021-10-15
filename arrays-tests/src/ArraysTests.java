import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArraysTests {

	@Test
	void simpleArrayTests() {
		int ar[] = new int[10];
		ar[9]=2;
		assertEquals(2,ar[9]);
		int ar1[]=ar;
		ar1[9]=20;
		assertEquals(20,ar1[9]);
		assertEquals(20,ar[9]);
	}
	@Test
	void swapTests() {
		int ar[]= {-10,20,12,40};
		assertEquals(40, ar[3]);
		assertEquals(12, ar[2]);
		//swap
		int tmp =ar[3];
		ar[3]=ar[2];
		ar[2]=tmp;
		assertEquals(12, ar[3]);
		assertEquals(40, ar[2]);
	}
	@Test
	void twoDimensional1() {
		int ar[][]= {{1,2,3},{10,20,30},{100,200,300}};
		assertEquals(20,ar[1][1]);
	}
	@Test
	void twoDimensional2() {
		int ar1[]= {10,-3,8};
		int ar2[]= {-7,11};
		int ar3[]= {1,2,3,4};
		int ar[][]= {ar1,ar2,ar3};
		ar[1][1]=10;
		assertEquals(10,ar2[1]);
	}
	@Test
	void systemArrayCopy1() {
		int ar[] = new int[5];
		int ar1[] = {1,2,3};
		int ar2[] = {4,5};
		int expected[] = {1,2,3,4,5};
		System.arraycopy(ar1, 0, ar, 0,ar1.length);
		System.arraycopy(ar2, 0, ar, ar1.length,ar2.length);
		assertArrayEquals(expected, ar);
	}
	@Test void systemArrayShift() {
		int ar[] = {1,2,3,4,5};
		int expexted[] = {2,3,4,5,0};
		System.arraycopy(ar, 1, ar, 0, ar.length-1);
		ar[ar.length-1]=0;
		assertArrayEquals(expexted,ar);
	}
	@Test
	void systemArrayDelete() {
		int ar[] = {1,2,3,4,5};
		int actual[] = new int[4];
		int expected[] = {1,2,4,5};
		System.arraycopy(ar, 0, actual, 0, 2);
		System.arraycopy(ar, 3, actual, 2, 2);
		assertArrayEquals(expected, actual);
	}
	@Test
	void systemArrayInsert() {
		int ar[] = {1,2,3,4,5};
		int actual[] = new int[6];
		int expected[] = {1,2,3,-10,4,5};
		System.arraycopy(ar,0,actual,0,3);
		System.arraycopy(ar,3,actual,4,2);
		actual[3]=-10;
		assertArrayEquals(expected, actual);
	}
	@Test
	void arraysCopyOf() {
		int ar[] = {1,2,3};
		int expected[] = {1,2,3,10,0};
		int actual[] = Arrays.copyOf(ar, 5);	
		actual[3]=10;
		assertArrayEquals(expected, actual);
	}
	@Test 
	void arrayCopyOfRange() {
		int ar[] = {1,2,3,4,5};
		int expected[] = {3,4};
		int actual[]=Arrays.copyOfRange(ar, 2, 4);
		assertArrayEquals(expected, actual);
	}
	@Test 
	void arraysSort() {
		int[] ar = {102,201,100,202,403,300};
		int expected[] = {100,102,201,202,300,403};
		Arrays.sort(ar);
		assertArrayEquals(expected, ar);
	}
	@Test 
	void arraysBinarySearch() {
		int ar[] = {102,201,100,202,403,300};
		int intKey = 202;
		Arrays.sort(ar);
		int actual = Arrays.binarySearch(ar, intKey);
		int expected = 3;
		assertEquals(expected, actual);
	}
	}


