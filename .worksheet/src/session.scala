object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(111); 
    def sum(xs: List[Int]): Int = {
		  if (xs.isEmpty) 0
    	else xs.head + sum(xs.tail)
  };System.out.println("""sum: (xs: List[Int])Int""");$skip(338); 
  
  
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
  };System.out.println("""max: (xs: List[Int])Int""");$skip(22); val res$0 = 
  
  sum(List(1,2,3));System.out.println("""res0: Int = """ + $show(res$0));$skip(19); val res$1 = 
  max(List(1,2,3));System.out.println("""res1: Int = """ + $show(res$1))}
}
