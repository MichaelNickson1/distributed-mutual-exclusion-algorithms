# distributed-mutual-exclusion-algorithms
implementation of Ricart Agarwala's distributed-mutual-exclusion-algorithms
Date: 21/5/2016
by: michael nickson
--------------------------------------------------------------------------------------------------------------------------------------
The project has two main components: Server and Client. The Server is a program that accepts a program(c,c++Java), compiles the same,
runs it , and returns the output to the client. We assume that the server can only accept one request at a time. Hence,accessing of
the server to run programs is the critical section. The project uses Java RMI(Remote method invocation) classes to achieve connections
between any two clients or between client and the server. Read the "How to start.txt" file in executables folder to start.
