package com.advanced_java.collection_framework_in_java.maindriver_controller;

import com.advanced_java.collection_framework_in_java.hashmap_crud_operation.HashMapCrudOperation;

public class MainDriver
{
	static HashMapCrudOperation hashMapCrudOperation = new HashMapCrudOperation();
	public static void main(String[] args)
	{
		hashMapCrudOperation.createTheData();
		
		hashMapCrudOperation.readTheData();
		
		hashMapCrudOperation.updateTheData();
		
		hashMapCrudOperation.deleteTheData();
	}
}