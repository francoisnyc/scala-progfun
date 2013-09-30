object session {
    def sum(xs: List[Int]): Int = {
		  if (xs.isEmpty) 0
    	else xs.head + sum(xs.tail)
  }                                               //> sum: (xs: List[Int])Int
  
  
  def max(xs: List[Int]): Int = {
  
  	def loop(maxi: Int, xs: List[Int]): Int= {
			if (xs.isEmpty) throw new java.util.NoSuchElementException()
			
			if(!xs.tail.isEmpty)
				if (xs.head > maxi) loop(xs.head, xs.tail)
				else loop (maxi, xs.tail)
			else
				if(xs.head > maxi) xs.head
				else maxi
		}
				
		loop(0, xs)
  }                                               //> max: (xs: List[Int])Int
  
  sum(List(1,2,3))                                //> res0: Int = 6
  max(List(1,2,3))                                //> res1: Int = 3
}