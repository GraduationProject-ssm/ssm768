# [首页查询更多项目](https://github.com/GraduationProject-ssm) 包安装运行


# ssm768基于java的实验室设备管理系统+jsp

![picture](https://raw.githubusercontent.com/GraduationProject-springboot/.github/main/img/wx.png)

### 点击播放视频 ▼
[![Watch the video](https://i.sstatic.net/Vp2cE.png)](https://www.bilibili.com/video/BV1Tm8QeZE4a?p=163)


# 绪论
## 1.1研究背景与意义
### 1.1.1研究背景
近年来，第三产业发展非常迅速，诸如计算机服务、旅游、娱乐、体育等服务行业，对整个社会的经济建设起到了极大地促进作用，这一点是毋庸置疑的。现下，国家也出台了一系列的政策来支持和鼓励第三服务产业的发展与完善，用以带动社会经济的发展[1]。所以，整体来说，国家是比较提倡发展第三方服务行业的。纵观计算机领域的整个发展历程，从计算机的诞生到现在，已经有几百年的历史了，计算机应用技术也逐步趋于成熟，并且相关的研究人员也在不断地对计算机技术进行发展和创新。再到如今，计算机已经发展成为一个比较热门的行业了。在高校中，计算机、人工智能等专业热度非常高，许多学生在选择专业的时候，大都优先考虑计算机专业。在社会上，计算机类行业也成为了比较受欢迎的行业，从在浏览器中访问的网址，到手机上的各种应用程序，到大型的软件服务设备，基本上都离不开计算机技术支持，以及硬件的支撑。

现在，计算机技术被运用到各类行业领域中，一些先进的计算机技术，比如人工智能、大数据等，也发挥着越来越重要的社会地位，比如疫情期间，通过大数据技术进行筛查，确定哪些人员无接触史，哪些人员需要重点观察，由此可以在极短的时间内，以最快的速度对疫情进行防控。在这个大背景环境的推动下，本人通过学习Java语言、MySQL数据库、JSP技术等相关的计算机技术，打好坚实的技术基础，方便后期对系统进行研发。而后再通过对系统进行分析，确定系统的总体功能需求，以及实现的可能性，方便接下来详细地设计相关的功能模块，最后成功的研发了一款基于Java的实验室设备管理系统。本系统改善了传统的管理模式，将原先的手工记录和管理信息，改进为使用计算机存储和管理信息记录，极大地方便了工作人员对相关数据进行处理，为学校节约了不少的员工费用和管理开销，并且能够在较短的时间内响应用户的需求，这种便捷的操作，满足了用户实际的使用需求，极大地方便了用户。
### 1.1.2研究意义
传统的实验室设备管理模式，主要是以人力为主进行管理和控制，由工作人员负责登记用户信息，再通过对照之前的信息记录，确定是否给用户提供相关的使用需求，以及如何提供能让用户满意的使用需求。这种管理模式已经适应不了时代的变化了，正在不断地走下坡路，并且逐步被信息化管理模式所取代。所谓的信息化管理模式，是现在主流的一种管理模式，其通过与计算机技术相结合的方式，对行业的整个工作模式和服务流程进行改进和完善。其主要通过使用计算机等设备，将工作服务流程电子化，并且进行存储记录，用以提高行业整体的服务水平。结合使用计算机技术，本人研发出一款基于Java的实验室设备管理系统，采用电子化的方式对数据信息进行存储，便于工作人员对相关信息进行记录和管理，有利于提高学校的工作运营效率以及工作人员的管理速度，以此更好的满足用户的相关需求，最终达到提升用户的使用感受的目的。
## 1.2国内外研究现状
### 1.2.1国外研究现状
美国是最先发展计算机技术的众多国家之一，早在上个世纪，美国就快速的将计算机技术发展起来，并且将其运用在军事、医院、学校、社会服务等场所。日本、德国等国家紧随其后，不断地发展和完善计算机技术，侧重将医疗、社会服务等领域与计算机技术相结合[2]。而后随着社会的发展与进步，计算机技术逐渐趋于成熟。许多发达国家在探索将计算机技术应用于各行各业中时，从另一个角度来看，也在不断地推进学校的信息化管理进程，使得实验室管理也变得更加网络化、信息化了。传统的实验室设备管理系统要是以C/S架构进行设计和实现，用户需要下载相应的应用程序，才能操作和使用系统。当系统需要升级更新时，也需要下载一定的更新包，才能正常使用相关的系统。这样一来，非常不利于用户的使用。近些年，相关行业开始以B/S架构为基础，对实验室设备管理系统进行研发。有许多专家表示，可以结合使用图像处理软件、人工智能技术等相关工具，深度地分析实验室设备管理系统，主要从简化运行操作，加设功能模块，美化系统界面，保障数据安全等方面，更深层次地提升和优化系统，并且尽可能地在理想状态下做到实时的信息共享[3]。
### 1.2.2国内研究现状
国内的计算机技术的发展虽然晚于国外，尤其是美国、英国、德国等发达国家。但是我国的计算机技术发展势头非常迅猛，近些年，也逐渐走向成熟和完善的阶段[4]。许多学校结合使用了云计算、人工智能等先进的计算机技术，自主研发了行业相关的信息管理系统，使得计算机技术越来越成熟，系统功能越来越完备。本人结合计算机技术，采用主流的B/S开发结构模式开发一款基于Java的实验室设备管理系统。本系统能够支持工作人员随时随地的通过使用浏览器进行访问操作，支持随时随地对相关的学校进行实验室设备管理，便于及时为用户提供一定的功能服务。并且所设计的系统基本上能够符合用户的客观使用需求，有利于充分协调学校的人力、财力、物力等资源，不断提高学校管理质量和水平。
## 1.3研究内容与方法
### 1.3.1研究内容
本人结合在学校学习的计算机专业课程，查阅相关的开发资源，开发实验室设备管理系统时，主要使用Java语言、MySQL数据库等技术。通过相关的需求调研可知，实验室设备管理系统主要分为管理员角色和用户角色，具体的功能设计包括注册登录管理、用户信息管理、实验室信息管理、设备信息管理等模块。注册登录管理功能是新用户在使用系统前，需要通过注册步骤，登记详细的信息资料，而后再通过输入正确的账号和密码，成功登录系统后，即可通过一系列的操作来满足自己的相关需求。用户信息管理功能是管理相关的用户信息资料，管理人员根据现实情况的需要，选择性的对用户信息记录进行更新处理。实验室信息管理是管理相关的实验室信息记录，保存详情的实验室信息，方便及时响应用户的服务请求。设备信息管理是管理相关的设备信息记录，方便相关人员及时查看设备信息，如果遇到异常的设备信息，可以及时对其进行处理，在较短的时间内解决问题，提高用户的使用体验。
### 1.3.2研究方法
本系统采用B/S架构，在idea平台上，通过编写相关的Java代码，设计系统功能模块，再通过MySQL数据库管控数据资源，由此有利于对系统相关数据进行必要的管理和控制。系统设计的最关键的环节，则是需要通过JSP技术创建系统动态页面，再通过Tomcat服务器将系统发布到浏览器上，以便相关用户的操作和使用。本系统的设计和实现有利于简化实验室设备的管理流程，减轻相关人员的工作压力，提高工作效率。本文首先介绍了实验室设备管理系统的研究背景与意义，其次介绍了系统的总体功能设计，接着将总体功能设计拆分成了各个功能子模块，然后对每一个小的功能子模块进行了详细设计，最后介绍了系统的功能模块展示结果和测试结果。
## 1.4论文的组织结构
开发基于Java的实验室设备管理系统的论文组织结构，大致可以被分为七个章节，具体的内容如下：

第一章为绪论，本章主要论述了系统的现实背景、理论价值等内容。根据研究背景与意义，介绍所要设计的系统的研究背景和理论依据，再通过国内外研究现状，了解当前相关的系统软件产品的实际研究情况，最后通过研究内容与方法，总体概括系统的整个开发流程和实现步骤，为系统提供可靠的理论依据和技术支持。

第二章为相关技术介绍，本章主要论述了系统开发的技术依据。本系统主要通过在idea平台上编写相关的Java代码，设计系统主要功能模块，使用SSM框架构建项目主流架构，MySQL数据库记录和管控相关的数据表格，便于数据库识别和存放相关的数据资源。

第三章为系统分析，本章主要论述了系统的需求、可行性分析等内容。根据需求分析，确认使用者对系统的基本功能需求，再通过在经济、操作、法律上进行可行性分析，分析系统研发的实际意义和使用价值，系统性能的稳定性和功能操作的便捷性，以及成功投入市场的可能性。

第四章为系统设计，本章主要论述了系统的功能、数据库设计等内容。根据功能设计，规划出主要的功能设计，方便满足用户的实际需求。根据数据库设计，设计相关的数据二维表格存放和管理与系统有关的数据信息，便于相关人员管理与系统有关的数据信息，维护和更新数据信息的安全。

第五章为系统实现，本章主要论述了用户信息管理、实验室信息管理、设备信息管理等功能模块。通过前面介绍的系统分析，功能及数据库设计等相关内容，详细地实现系统功能模块。这一过程就是系统的具体实现阶段，站在系统的整体设计角度出发，对系统的实现进行必要分析可知，这一阶段是极为重要，直接关系到用户对系统的使用感受。

第六章为系统测试，本章主要论述了测试相关的内容。本系统主要使用功能测试的方法，检查测验系统主要功能，测试所设计的系统功能能否正常使用，并且用户能够正常操作和使用，在系统运行过程中是否发生异常，如运行异常、数据异常、结果异常等，并且根据测试结果，给出相应的测试总结，由此得出相关结论，说明系统是否达到预期要求、设计目的。

第七章为总结与展望，总结全文所阐述的相关内容，并对系统的未来的改进和发展工作提出展望。整体来看，本系统的开发基本上是比较顺利的，功能设计也比较齐全，未来将对系统的相关功能进一步优化，并加强系统的性能设计，简化系统的操作难度，使其能够满足更多用户的使用需求。
#
# 2相关技术介绍
## 2.1 B/S架构
就软件开发的现状而言，目前主要使用的系统开发结构模式大致可以分为C/S模式和B/S模式[5]。基于C/S模式下开发的系统，用户必须下载相应的客户端，即应用程序，才能操作和使用软件系统的相关功能模块。从使用者的角度来看，由于下载和安装客户端的步骤比较繁琐，期间还需要确保下载网速的稳定性，以及安装步骤的正确性，进而增加了用户放弃使用该系统的可能性，由此可见C/S模式具有很大的局限性。

由于C/S模式适用于小范围的局域网，并且具有一定的通信效率，所以在以前系统规模很小的时代，主要使用C/S模式对系统开发。随着时代地发展以及社会地进步，C/S模式也越来越满足不了开发者的设计需要，以及使用者的使用需求[6]。当下，C/S模式已经满足不了实际的系统程序设计要求，由此，B/S模式以C/S模式为基础而被提出，并且在近些年逐渐发展成为主流的开发结构模式。在B/S模式下开发的系统，不再需要用户下载和安装相应的应用程序，直接通过使用浏览器，输入正确的网站地址，以访问网站的形式实现系统的相关功能操作，这一特点对C/S模式下的开发设计做出了极大地改进，当然，使用本系统的前提是确保账号和密码是合法的。
## 2.2 Java语言
Java语言是一种将数据和操作方法封装成对象的程序设计语言，它拥有着优秀的技术体系结构。目前在市场上，很大一部分的应用系统主要使用Java语言进行开发[7]。Java语言具有简单易懂，操作方便，健壮性强等优点，开发人员能够的在短时间内理解和掌握Java语言，并将其运用到具体的系统开发过程中学。针对于系统内存管理问题，Java语言为解决这类问题，内部提供了垃圾回收机制。为了极大地简化了开发编程的难易程度，Java语言还将C语言中的指针，改进成了引用，所以受到了很多开发人员的喜爱。Java语言还具有高移植性，这一特点有利于开发人员更新和维护相关代码，由它所开发的系统可以支持在不同的浏览器中打开。因为使用Java开发的系统兼容性较强，代码通用性较高，为了后期方便对系统进行完善和维护，所以本人最终选择使用Java语言开发本系统。
## 2.3 JSP技术
JSP技术是一种动态网页技术，由Sun公司提出的并为其提供了稳定可靠、高效率、高质量的运行环境[8]。JSP技术的基本原理是技术人员通过理解和掌握与JSP相关的语法，对系统的动态页面进行设计。而后，JSP技术内部的应用服务器会将由JSP设计的页面自动解释成HTML页面，并对相关的HTML页面进行显示。因为JSP技术运行环境非常强大，语法比较简单，而且在实际的运行过程中，它是嵌入HTML文本中被执行的，所以能够支持在HTML工具以及不同类型的浏览器上运行。开发人员可以通过使用JSP技术动态地进行编程，由此可以开发出自己想要的网站类型。并且开发人员还可以通过在网上查看到与JSP技术有关的参考资料，比如使用手册、错误排查手册等，便于尽快解决系统页面设计过程中遇到的开发问题，减少相关人员的开发时间。
## 2.4 MySQL数据库
MySQL数据库是一种使用较多的关系型数据库。因为其具有开源免费、占用内存少、安装简单、操作便捷、使用灵活等优点，所以经常被运用于中小型的系统开发中[9]。MySQL数据库可以支持多线程，在某一段时间内，可以及时响应不同用户的使用需求消息。MySQL数据库还自带了优化器，方便设计人员在 使用过程中，快速的查询相关的数据信息[10]。除此之外，SQL server数据库也是比较受欢迎的，它在数据安全、系统稳定等方面还是比有所保障，但是由于其收费使用、占用内存大、操作复杂、维护成本高， 一般适用于中型及以上的系统开发中。MySQL数据库也有着许多的应用程序接口，以供相关的编程语言使用，编写的代码具有极高的通用性和维护性，并且MySQL数据库能够迅速的处理上千条数据记录，在系统故发生障时，能通过日志文件快速恢复。MySQL数据库与SQL server数据库相比较，综合考虑成本开销、占用内存大小、代码通用、数据维护、操作难易程度等方面，MySQL数据库占有很大的优势，在数据库设计人员的眼中，MySQL数据库的实际运用价值极高。

#
# 3系统分析
## 3.1系统的可行性分析
### 3.1.1经济可行性
对系统进行经济可行性分析，也可以被称为对系统进行经济可行性研究，它是从社会的经济发展出发，通过研究整个的系统可行性，对成本收益情况进行全面地、具体地分析，并且根据所分析的可行性报告，为相关的投资者提供最科学的决策理论和最优的投资方案。本系统的开发促进了学校的信息化管理，管理人员可以直接通过在浏览器上发布实验室设备管理系统的网站地址，即可用户根据一定的需要，有选择的对系统相关功能进行操作。这种方式打破了时间和空间的限制，可以使得学校在较短的时间内最大化地管理实验室设备的相关信息。并且本系统所使用的开发技术和相关工具，大部分是开源的、免费的，所以可以节约很大一笔开发成本。综合上述内容分析可知，本系统的实现在经济层面上是具备可行性的。
### 3.1.2技术可行性
本系统是基于Java语言而进行开发的，因为Java语言简单易学、稳定性强、代码利用率高等特点，所以许多的开发技术人员均喜欢使用Java语言进行系统设计。现今很多程序系统的研究和开发，是通过使用Java语言进行编码设计的。此外，Java语言还具有跨平台的优点，这意味着所设计的系统是与平台无关的，也就说明由Java语言开发的系统可以支持在不同的浏览器上运行和使用。在条件大致相同的情况下，对比其他数据库，本系统使用的是MySQL数据库的相关语法简单易懂，数据库设计人员可以尽可能快的对其掌握和使用。MySQL数据库还具有占用系统内存少、功能齐全、响应速度快等特点，能够在极短时间内处理上千条信息记录，所以能够保证系统可以高效地运行和工作。综合上述内容分析可知，系统的实现在技术层面上是具备可行性的。
### 3.1.3操作可行性
在一定程度上，行业的信息化建设促进着社会的发展。人们通过使用手机上的应用程序，比如，通过使用电子商务系统，可以实现网上购物、在线支付等功能；通过使用国家官方网站，可以查看最新消息，申报个人业务；通过使用医院管理系统，可以进行网上预约挂号，在线查看体检报告等操作。在这些应用的背景下，本系统使用的是B/S开发结构模式，网站界面以人性化的设计为主，具有美观友好、交互性好等优点，用户不需要掌握一定的编程技术，直接通过对系统进行简单的功能操作，即可满足自己的使用需求。本系统还设计了一些提示信息，便于用户更好的理解系统相关功能，较快的以正确的操作方式来使用系统。综合上述内容分析可知，系统的实现在操作层面上是具备可行性的。
## 3.2系统的需求分析
在软件设计开发的整个过程中，需求分析占用的时间是比较长的，也是比较耗费人力的阶段[11]。需求分析是设计系统功能模块的总方向，通过需求分析阶段，可以确定系统的基本功能设计，以及在最后的系统验收阶段，通过对照需求分析报告，验证系统的功能设计是否合理，能否满足用户的基本需要，最终判断评定系统设计是否成功完成。

本文主要通过问卷调查的方式，来分析实验室设备管理系统所需要的相关功能[12]。根据调查结果显示，系统用户主要有两种类型，一种是以使用为主要目的的员工角色类型，另一种是以管理为主要目的的管理员角色类型。员工用户可以查询个人信息、实验室信息、设备信息等，管理员可以管理用户信息、实验室信息、设备信息等。其中，用户信息、实验室信息等都是非常重要的数据记录，在系统设计的过程中，需要进行一定的加密处理，实时保障用户个人账户和资料信息等数据的安全。管理员用例图如图3-1所示，校方用例图如图3-2所示，学生用例图如图3-3所示。

![](/md/blog.003.png)

图3-1管理员用例图

![](/md/blog.004.png)

图3-2校方用例图	

![](/md/blog.005.png)

图3-3学生用例图	
## 3.3业务分析
实验室设备管理系统研发的主要业务流程，首先是先通过需求分析，规划设计出相关的系统功能，然后通过数据库设计，实现后台数据与前端的交互工作，再通过编码实现，具体设计出功能模块，对系统进行设计和实现，本系统的主要业务分析如图所示3-4所示。

![D:\用户目录\Documents\Tencent Files\736505925\FileRecv\DSH}\_\_@$MA6E\_E[YBHK0`JA.png](/md/blog.006.png)

图3-4系统的业务设计图

# 4系统设计
## 4.1系统的总体功能设计
系统的总体功能设计，是需求分析的下一个阶段，是系统实现的上一个阶段，它是系统详细功能设计的一个大方向，也就是说系统的各类子功能模块的设计，都是以总体功能设计为目标而进行的。通过对系统进行需求分析可知，可以大致了解系统具体所需要的相关功能。本系统的管理员功能结构图如图4-1所示，校方功能结构图如图4-2所示，学生功能结构图如图4-3所示。

![](/md/blog.007.png)

图4-1管理员功能结构图

![](/md/blog.008.png)

图4-2校方功能结构图

![](/md/blog.009.png)

图4-3学生功能结构图
## 4.2系统流程设计
### 4.2.1登录流程
用户需要通过输入正确格式账号和密码信息，才能成功使用本系统，实现自己所需的功能操作，登录流程图如图4-4所示。

![](/md/blog.010.png)

图4-4登录流程图

### 4.2.2注册流程
首次使用本系统的新用户，需要通过注册操作，再通过登录操作，才能成功使用系统，注册流程图如图4-5所示。

![](/md/blog.011.png)

图4-5注册流程图
### 4.2.3添加信息流程
当添加系统所需要的数据信息时，需要输入正确、合法的字符格式，才能成功添加数据信息，添加信息流程图如图4-6所示。

![](/md/blog.012.png)

图4-6添加信息流程图
### 4.2.4修改信息流程
当修改系统所需要的数据信息时，需要输入正确、合法的字符格式，才能成功修改数据信息，修改信息流程图如图4-7所示。

![](/md/blog.013.png)

图4-7修改信息流程图
### 4.2.5删除信息流程
当删除系统所需要的数据信息时，需要将需要删除的数据信息选中，再通过确认删除按钮，成功将其进行删除，删除信息流程图如图4-8所示。

![](/md/blog.014.png)

图4-8删除信息流程图
## 4.3数据库设计
### 4.3.1概念设计
本系统使用开源的MySQL数据库，对相关的数据资源进行记录和管控[13]。数据库设计阶段一般可以被分为概念设计和逻辑设计这两个阶段。这两个阶段起到作用是不同的，概念设计阶段是实现基础，逻辑设计阶段最终目标[14]。概念设计阶段主要通过使用实体-联系图（E-R图）的方式，将现实世界中用户的相关需求抽象化为虚拟世界中的概念模型。本人通过设计E-R图，详细的对系统中的实体以及实体之间的联系进行了表达。各实体信息的E-R图如图4-9、图4-10、图4-11、图4-12、图4-13、图4-14、图4-15、图4-16所示，系统总体E-R图如图4-17所示。

![](/md/blog.015.png)

图4-9管理员实体属性图

![](/md/blog.016.png)

图4-10学生实体属性图

![](/md/blog.017.png)

图4-11校方信息实体属性图

![](/md/blog.018.png)

图4-12字典信息实体属性图

![](/md/blog.019.png)

图4-13实验室信息实体属性图

![](/md/blog.020.png)

图4-14设备信息实体属性图

![](/md/blog.021.png)

图4-15设备借用信息实体属性图

![](/md/blog.022.png)

图4-16公告信息实体属性图

![](/md/blog.023.png)

图4-17系统总体E-R图
### 4.3.2逻辑设计
逻辑设计阶段主要的工作是将概念设计中的E-R图，转换成方便系统进行存储和管理的二维表格形式[15]。这一阶段也可以被称为数据库的详细设计，其直接关系到系统功能模块的正常运行、数据信息的正常更新等。在设计过程中，需要充分考虑数据库的规范性和合理性，使得能够满足系统的功能和性能需求。本系统相关的数据表格设计内容如下所示。

表4-1 管理员信息表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|id|Int|编号|否|
|2|username|String|用户名|是|
|3|password|String|密码|是|
|4|role|String|角色|是|
|5|addtime|Date|新增时间|是|

表4-2 学生信息表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|id|Int|编号|否|
|2|username|String|账户|是|
|3|password|String|密码|是|
|4|xuesheng\_name|String|姓名|是|
|5|xuesheng\_phone|String|手机号|是|
|6|xuesheng\_id\_number|String|身份证号|是|
|7|xuesheng\_photo|String|照片|是|
|8|sex\_types|Integer|性别|是|
|9|xuesheng\_email|String|电子邮箱|是|
|10|create\_time|Date|创建时间|是|

表4-3 校方信息表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|id|Int|编号|否|
|2|username|String|账户|是|
|3|password|String|密码|是|
|4|xiaofang\_name|String|名称|是|
|5|xiaofang\_photo|String|头像|是|
|6|xiaofang\_email|String|校方联系邮箱|是|
|7|create\_time|Date|创建时间|是|

表4-4 字典信息表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|id|Int|编号|否|
|2|dic\_code|String|字段|是|
|3|dic\_name|String|字段名|是|
|4|code\_index|Integer|编码|是|
|5|index\_name|String|编码名字|是|
|6|super\_id|Integer|父字段编号|是|
|7|beizhu|String|备注|是|
|8|create\_time|Date|创建时间|是|

表4-5 实验室信息表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|id|Int|编号|否|
|2|shiyanshi\_name|String|实验室名称|是|
|3|shiyanshi\_types|Integer|实验室类型|是|
|4|shiyanshi\_address|String|实验室位置|是|
|5|insert\_time|Date|添加时间|是|
|6|shiyanshi\_content|String|实验室详情|是|
|7|create\_time|Date|创建时间|是|

表4-6 设备信息表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|id|Int|编号|否|
|2|shiyanshi\_id|Integer|实验室|是|
|3|shebei\_name|String|设备名称|是|
|4|shebei\_types|Integer|设备分类|是|
|5|shebei\_number|Integer|设备数量|是|
|6|insert\_time|Date|添加时间|是|
|7|shebei\_content|String|设备详情|是|
|8|create\_time|Date|创建时间|是|

表4-7设备借用信息表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|id|Int|编号|否|
|2|xuesheng\_id|Integer|学生|是|
|3|shebei\_id|Integer|设备|是|
|4|insert\_time|Date|申请时间|是|
|5|shebei\_jieyong\_number|Integer|借用数量|是|
|6|beizhu\_content|String|借用原因|是|
|7|zhuanjiao\_types|Integer|是否转交|是|
|8|shebei\_jieyong\_yesno\_types|Integer|借用状态|是|
|9|shebei\_jieyong\_yesno\_text|String|审核意见|是|
|10|shebei\_jieyong\_shenhe\_time|Date|审核时间|是|

表4-8公告信息表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|id|Int|编号|否|
|2|gonggao\_name|String|公告名称|是|
|3|gonggao\_types|Integer|公告类型|是|
|4|gonggao\_content|String|公告详情|是|
|5|insert\_time|Date|发布公告时间|是|
|6|create\_time|Date|创建时间|是|


# 5系统实现
## 5.1管理员角色功能设计
### 5.1.1个人中心
通过设计的个人中心管理功能模块，管理用户可以选择查看个人资料信息，选择更新个人相关的资料信息记录；也可以选择修改账号密码，通过不定期的对个人账户密码进行更新，加密确保重要信息的安全，修改密码界面设计如图5-1所示，个人信息界面设计如图5-2所示。

![](/md/blog.024.png)

图5-1修改密码界面

![](/md/blog.025.png)

图5-2个人信息界面
### 5.1.2基础数据管理
通过设计的基础数据管理功能模块，管理用户可以对相关的公告类型、设备类型、实验室类型信息进行管理，比如管理用户可以查看详细的公告类型、设备类型、实验室类型信息，删除失效的公告类型、设备类型、实验室类型信息记录等，公告类型管理界面设计如图5-3所示，设备类型管理界面设计如图5-4所示，实验室类型管理界面设计如图5-5所示。

![](/md/blog.026.png)

图5-3公告类型管理界面

![](/md/blog.027.png)

图5-4设备类型管理界面

![](/md/blog.028.png)

图5-5实验室类型管理界面
### 5.1.3公告管理
通过设计公告管理功能模块，管理员可以管理相关的公告信息记录，可以选择查看公告的详情信息；可以选择删除已经失效的公告信息记录；也可以选择添加新的公告信息记录，需要注意的是，需要输入正确的字符格式，才能成功添加新的公告信息记录，公告管理界面设计如图5-6所示。

![](/md/blog.029.png)

图5-6公告管理界面
### 5.1.4实验室管理
通过设计实验室管理功能模块，管理员可以管理相关的实验室信息记录，可以选择查看实验室的详情信息；可以选择删除已经失效的实验室信息记录；也可以选择添加新的实验室信息记录，需要注意的是，需要输入正确的字符格式，才能成功添加新的实验室信息记录，实验室管理界面设计如图5-7所示。

![](/md/blog.030.png)

图5-7实验室管理界面
### 5.1.5设备管理
通过设计设备管理功能模块，管理员可以管理相关的设备信息记录，可以选择查看设备的详情信息；可以选择删除已经失效的设备信息记录；也可以选择添加新的设备信息记录，需要注意的是，需要输入正确的字符格式，才能成功添加新的设备信息记录，设备管理界面设计如图5-8所示。

![](/md/blog.031.png)

图5-8设备管理界面
### 5.1.6设备借用管理
通过设计设备借用管理功能模块，管理员可以管理相关的设备借用信息记录，可以选择查看设备借用的详情信息；可以选择删除已经失效的设备借用信息记录；也可以选择添加新的设备借用信息记录，需要注意的是，需要输入正确的字符格式，才能成功添加新的设备借用信息记录，设备借用管理界面设计如图设备管理界面设计如图5-9所示。

![](/md/blog.032.png)

图5-9设备借用管理界面
### 5.1.7校方管理
通过设计校方管理功能模块，管理员可以管理相关的校方信息资料，可以选择查看校方的详细资料；可以选择修改校方信息记录；可以选择删除已经注销的校方信息记录；也可以选择添加新的校方信息记录，需要注意的是，需要输入正确的字符格式，才能成功添加新的校方信息记录，校方管理界面设计如图5-10所示。

![](/md/blog.033.png)

图5-10校方管理界面
### 5.1.8学生管理
通过设计学生管理功能模块，管理员可以管理相关的学生信息资料，可以选择查看学生的详细资料；可以选择修改学生信息记录；可以选择删除已经注销的学生信息记录；也可以选择添加新的学生信息记录，需要注意的是，需要输入正确的字符格式，才能成功添加新的学生信息记录，学生管理界面设计如图5-11所示。

![](/md/blog.034.png)

图5-11学生管理界面
## 5.2用户角色功能设计
### 5.2.1个人中心
通过设计的个人中心管理功能模块，用户可以选择查看个人资料信息，选择更新个人相关的资料信息记录；也可以选择修改账号密码，通过不定期的对个人账户密码进行更新，加密确保重要信息的安全，修改密码界面设计如图5-12所示，个人信息界面设计如图5-13所示。

![](/md/blog.035.png)

图5-12修改密码界面

![](/md/blog.036.png)

图5-13个人信息界面
### 5.2.2公告管理
通过设计公告管理功能模块，用户可以查看相关的公告信息记录，比如查看到公告名称、公告类型、发布公告时间等信息，公告管理界面设计如图5-14所示。

![](/md/blog.037.png)

图5-14公告管理界面
### 5.2.3实验室管理
通过设计实验室管理功能模块，用户可以查看相关的实验室信息记录，比如查看到实验室名称实验室类型、实验室位置、添加时间等信息，实验室管理界面设计如图5-15所示。

![](/md/blog.038.png)

图5-15实验室管理界面
### 5.2.4设备管理
通过设计设备管理功能模块，用户可以查看相关的设备信息记录，比如查看到实验室名称、实验室类型、设备名称、设备分类、设备数量等信息，设备管理界面设计如图5-16所示。

![](/md/blog.039.png)

图5-16设备管理界面
### 5.2.5设备借用管理
通过设计设备借用管理功能模块，用户可以查看相关的设备借用信息记录，比如查看到设备名称、设备分类、姓名、手机号、照片、申请时间、审核意见、审核时间等信息，设备借用管理界面设计如图5-17所示。

![](/md/blog.040.png)

图5-17设备借用管理界面

### 5.2.6学生管理
通过设计学生管理功能模块，用户可以查看相关的学生信息资料，比如可以查看到账户、姓名、手机号、身份证号、照片、电子邮箱等信息，学生管理界面设计如图5-18所示。

![](/md/blog.041.png)

图5-18学生管理界面
#
# 系










