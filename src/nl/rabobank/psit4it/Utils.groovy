def aUtilsMethod () {
  println "A response from aUtilsMethod"
  def testString = "dit is een shell command test in a library"
  sh 'echo ${testString}'
}