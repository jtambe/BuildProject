// ParentViewMapperImpl 

package com.build.devtest;

import java.util.List;

public class ParentViewMapperImpl Implements ParentViewMapper
{

	public List<ParentView> mapRowsToViews(List<ParentRow> parentRows, List<ChildRow> childRows)
	{			

		List<ParentView> prvwlist = new List<ParentView>();
		for(ParentRow prrow : parentRows)
		{			
			List<ChildView> chvwlist = new List<ChildView>();
			ParentView prvw = new ParentView(prrow.firstName, prrow.lastName, prrow.age, prrow.parentId, chvwlist);		
			
			for(ChildRow childrow : childRows)
			{
				if(childrow.parentId == prrow.ParentId)
				{
					ChildView chvw = new ChildView(childrow.firstName, childrow.lastName, childrow.age, childrow.childId, null);
					chvwlist.add(chvw);
				}
				
			}

			prvwlist.add(prrow);
		}

		return prvwlist;
	}

}