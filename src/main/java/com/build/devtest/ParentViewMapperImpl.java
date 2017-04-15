// ParentViewMapperImpl 

package com.build.devtest;

import java.util.Collections;
import java.util.List;


public class ParentViewMapperImpl implements ParentViewMapper
{

	public List<ParentView> mapRowsToViews(List<ParentRow> parentRows, List<ChildRow> childRows)
	{			

		List<ParentView> prvwlist = Collections.emptyList();
		for (ParentRow prrow : parentRows)
		{			
			List<ChildView> chvwlist = Collections.emptyList();
			ParentView prvw = new ParentView(prrow.getFirstName(), 
				prrow.getLastName(), prrow.getAge(), prrow.getParentId(), chvwlist);		
			
			for (ChildRow childrow : childRows)
			{
				if(childrow.getParentId() == prrow.getParentId())
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

}