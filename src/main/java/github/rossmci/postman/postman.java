/*
 * Copyright (c) 2020 Ross Mcinerney <https://github.com/rossmci>. All rights reserved.
 */
package github.rossmci.postman;

/**
 *
 * @author Ross Mcinerney
 */
public class postman
{

	/**
	 * @param args the command line arguments
	 */
	public static String printClosedBoxsNumbers(boolean[] postBoxes)
	{
		var output = "";
		for (int index = 0; index < postBoxes.length; index++)
		{
			if (isClosed(postBoxes[index]))
			{
				output += (index + 1) + ", ";
			}
		}
		return output;
	}

	public static boolean isClosed(boolean postBoxValue)
	{
		return !postBoxValue;
	}

	public static void main(String[] args)
	{
		final int postBoxCount = 150;
		boolean[] postBoxes = new boolean[postBoxCount];

		System.out.println("Inital Open Boxes");
		System.out.println(printClosedBoxsNumbers(postBoxes));

		for (int postBoxSelection = 2; postBoxSelection < postBoxes.length; postBoxSelection++)
		{
			for (int index = postBoxSelection - 1; index < postBoxes.length; index++)
			{
				if (index % postBoxSelection == 0)
				{
					postBoxes[index] = !postBoxes[index];
				}
			}
		}

		System.out.println("After Postman Pat");
		System.out.println(printClosedBoxsNumbers(postBoxes));
	}
}
