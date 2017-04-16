// ParentViewMapperImpl 

package com.build.devtest;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class ParentViewMapperImpl implements ParentViewMapper
{
	public List<ParentView> mapRowsToViews(List<ParentRow> parentRows, List<ChildRow> childRows)
	{			

		ArrayList<ParentView> prvwlist = new ArrayList<ParentView>();
		for (ParentRow prrow : parentRows)
		{			
			ArrayList<ChildView> chvwlist = new ArrayList<ChildView>();
			ParentView prvw = new ParentView(prrow.getFirstName(), 
				prrow.getLastName(), prrow.getAge(), prrow.getParentId(), chvwlist);		
			
			for (ChildRow childrow : childRows)
			{
				if(childrow.getParentId().equalsIgnoreCase(prrow.getParentId()) )
				{
					ChildView chvw = new ChildView(childrow.getFirstName(),
						childrow.getLastName(), childrow.getAge(), childrow.getChildId(), null);
					
					chvwlist.add(chvw);
				}
				
			}

			prvwlist.add(prvw);
		}

		return prvwlist;
	}


	// public List<ParentView> mapRowsToViews(List<ParentRow> parentRows, List<ChildRow> childRows)
	// {			

	// 	List<ParentView> prvwlist = Collections.<ParentView>emptyList();
	// 	for (ParentRow prrow : parentRows)
	// 	{			
	// 		List<ChildView> chvwlist = Collections.<ChildView>emptyList();
	// 		ParentView prvw = new ParentView(prrow.getFirstName(), 
	// 			prrow.getLastName(), prrow.getAge(), prrow.getParentId(), chvwlist);		
			
	// 		for (ChildRow childrow : childRows)
	// 		{
	// 			if(childrow.getParentId() == prrow.getParentId())
	// 			{
	// 				ChildView chvw = new ChildView(childrow.getFirstName(),
	// 					childrow.getLastName(), childrow.getAge(), childrow.getChildId(), null);
					
	// 				chvwlist.add(chvw);
	// 			}
				
	// 		}

	// 		prvwlist.add(prvw);
	// 	}

	// 	return prvwlist;
	// }

}