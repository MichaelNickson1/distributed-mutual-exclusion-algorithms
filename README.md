# distributed-mutual-exclusion-algorithms
implementation of Ricart Agarwala's distributed-mutual-exclusion-algorithms
Date: 21/5/2016
by: michael nickson
--------------------------------------------------------------------------------------------------------------------------------------
Implement distributed mutual exclusion algorithm (Ricart-Agrawala) in a set of N (N number of processes) process/programs. Each process communicates with other process using TCP/IP. The addresses, ports numbers etc. are given in a configuration. Number of process is limited to 20. The initial owner of a token has to be chosen using some election algorithm (e.g. tyran algorithm). The token is kept by a process no longer than 10 s. After that if a process wants to get access the resource guarded by the algorithm, does the algorithm once again to get the access. The token is assumed as lost when the process not receive the token upon the request longer than 15 * N second, where N is the number of processes. Loosing the token starts the election algorithm.  
Processes have to have ability to connect to other processes at any time, especially after killing a process from operating system console.
Possessing of the token, pending elections etc. have to be signaled on the screen.

Processes can be connected to each other but recommended solution is to build a tree of the presses which means that each process connect exactly to one process and to each process can be connected many other ones. Processes route messages like packets in IP networks. To simplify the task the routing algorithm is not expected. Instead of that each message can be sent through the whole tree and reach each of the processes. Process accept only messages addressed to it.
by using (c#,c++ or java)
