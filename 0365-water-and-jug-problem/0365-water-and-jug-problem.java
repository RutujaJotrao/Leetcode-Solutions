class Solution {
    public boolean canMeasureWater(int x, int y, int z) {
      if(x+y < z)
		{
			return false;
		}

		int[] directions={x,-x,y,-y};
		Queue<Integer> queue=new ArrayDeque<Integer>();
		Set<Integer> visited=new HashSet<Integer>();

		queue.offer(0);
		visited.add(0);

		while(!queue.isEmpty())
		{
			int current=queue.poll();
			if(current == z)
			{
				return true;
			}

			for(int direction:directions)
			{
				int total=current+direction;
				if(total == z)
				{
					return true;
				}

				if(total<0 || total > x+y)
				{
					continue;
				}

				if(!visited.contains(total))
				{
					visited.add(total);
					queue.offer(total);
				}
			}
		}
		return false;
	}
}