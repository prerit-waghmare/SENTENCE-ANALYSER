/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentence_analysis;

/**
 *
 * @author PRERIT WAGHMARE
 */
import java.util.ArrayList;
import java.util.Scanner;
class class_for_recoginization {
    

    
String verb1[]={"abash",	"abate",	"abide",	"absorb",	"accept",	"accompany",	"ache",	"achieve",	"acquire",	"act",	"add",	"address",	"adjust",	"admire",	"admit",	"advise",	"afford",	"agree",	"alight",	"allow",	"animate",	"announce",	"answer",	"apologize",	"appear",	"applaud",	"apply",	"approach",	"approve",	"argue",	"arise",	"arrange",	"arrest",	"ask",	"assert",	"assort",	"astonish",	"attack",	"attend",	"attract",	"audit",	"avoid",	"awake",	"bang",	"banish",	"bash",	"bat",	"be (am,are)",	"bear",	"bear",	"beat",	"beautify",	"become",	"befall",	"beg",	"begin",	"behave",	"behold",	"believe",	"belong",	"bend",	"bereave",	"beseech",	"bet",	"betray",	"bid",	"bid",	"bind",	"bite",	"bleed",	"bless",	"blossom",	"blow",	"blur",	"blush",	"board",	"boast",	"boil",	"bow",	"box",	"bray",	"break",	"breathe",	"breed",	"bring",	"broadcast",	"brush",	"build",	"burn",	"burst",	"bury",	"bust",	"buy",	"buzz",	"calculate",	"call",	"canvass",	"capture",	"caress",	"carry",	"carve",	"cash",	"cast",	"catch",	"cause",	"cease",	"celebrate",	"challenge",	"change",	"charge",	"chase",	"chat",	"check",	"cheer",	"chew",	"chide",	"chip",	"choke",	"choose",	"classify",	"clean",	"cleave",	"click",	"climb",	"cling",	"close",	"clothe",	"clutch",	"collapse",	"collect",	"colour",	"come",	"comment",	"compare",	"compel",	"compete",	"complain",	"complete",	"conclude",	"conduct",	"confess",	"confine",	"confiscate",	"confuse",	"congratulate",	"connect",	"connote",	"conquer",	"consecrate",	"consent",	"conserve",	"consider",	"consign",	"consist",	"console",	"consort",	"conspire",	"constitute",	"constrain",	"construct",	"construe",	"consult",	"contain",	"contemn",	"contend",	"contest",	"continue",	"contract",	"contradict",	"contrast",	"contribute",	"contrive",	"control",	"convene",	"converge",	"converse",	"convert",	"convey",	"convict",	"convince",	"coo",	"cook",	"cool",	"co-operate",	"cope",	"copy",	"correct",	"correspond",	"corrode",	"corrupt",	"cost",	"cough",	"counsel",	"count",	"course",	"cover",	"cower",	"crack",	"crackle",	"crash",	"crave",	"create",	"creep",	"crib",	"cross",	"crowd",	"crush",	"cry",	"curb",	"cure",	"curve",	"cut",	"cycle",	"damage",	"damp",	"dance",	"dare",	"dash",	"dazzle",	"deal",	"decay",	"decide",	"declare",	"decorate",	"decrease",	"dedicate",	"delay",	"delete",	"deny",	"depend",	"deprive",	"derive",	"describe",	"desire",	"destroy",	"detach",	"detect",	"determine",	"develop",	"die",	"differ",	"dig",	"digest",	"dim",	"diminish",	"dine",	"dip",	"direct",	"disappear",	"discover",	"discuss",	"disobey",	"display",	"dispose",	"distribute",	"disturb",	"disuse",	"dive",	"divide",	"do",	"donate",	"download",	"drag",	"draw",	"dream",	"dress",	"drill",	"drink",	"drive",	"drop",	"dry",	"dump",	"dwell",	"dye",	"earn",	"eat",	"educate",	"empower",	"empty",	"encircle",	"encourage",	"encroach",	"endanger",	"endorse",	"endure",	"engrave",	"enjoy",	"enlarge",	"enlighten",	"enter",	"envy",	"erase",	"escape",	"evaporate",	"exchange",	"exclaim",	"exclude",	"exist",	"expand",	"expect",	"explain",	"explore",	"express",	"extend",	"eye",	"face",	"fail",	"faint",	"fall",	"fan",	"fancy",	"favour",	"fax",	"feed",	"feel",	"ferry",	"fetch",	"fight",	"fill",	"find",	"finish",	"fish",	"fit",	"fix",	"fizz",	"flap",	"flash",	"flee",	"fling",	"float",	"flop",	"fly",	"fold",	"follow",	"forbid",	"force",	"forecast",	"foretell",	"forget",	"forgive",	"forlese",	"form",	"forsake",	"found",	"frame",	"free",	"freeze",	"frighten",	"fry",	"fulfil",	"gag",	"gain",	"gainsay",	"gash",	"gaze",	"get",	"give",	"glance",	"glitter",	"glow",	"go",	"google",	"govern",	"grab",	"grade",	"grant",	"greet",	"grind",	"grip",	"grow",	"guard",	"guess",	"guide",	"handle",	"hang",	"happen",	"harm",	"hatch",	"hate",	"have",	"heal",	"hear",	"heave",	"help",	"hew",	"hide",	"hinder",	"hiss",	"hit",	"hoax",	"hold",	"hop",	"hope",	"horrify",	"hug",	"hum",	"humiliate",	"hunt",	"hurl",	"hurry",	"hurt",	"hush",	"hustle",	"hypnotize",	"idealize",	"identify",	"idolize",	"ignite",	"ignore",	"ill-treat",	"illuminate",	"illumine",	"illustrate",	"imagine",	"imbibe",	"imitate",	"immerse",	"immolate",	"immure",	"impair",	"impart",	"impeach",	"impede",	"impel",	"impend",	"imperil",	"impinge",	"implant",	"implicate",	"implode",	"implore",	"imply",	"import",	"impose",	"impress",	"imprint",	"imprison",	"improve",	"inaugurate",	"incise",	"include",	"increase",	"inculcate",	"indent",	"indicate",	"induce",	"indulge",	"infect",	"infest",	"inflame",	"inflate",	"inflect",	"inform",	"infringe",	"infuse",	"ingest",	"inhabit",	"inhale",	"inherit",	"initiate",	"inject",	"injure",	"inlay",	"innovate",	"input",	"inquire",	"inscribe",	"insert",	"inspect",	"inspire",	"install",	"insult",	"insure",	"integrate",	"introduce",	"invent",	"invite",	"join",	"jump",	"justify",	"keep",	"kick",	"kid",	"kill",	"kiss",	"kneel",	"knit",	"knock",	"know",	"lade",	"land",	"last",	"latch",	"laugh",	"lay",	"lead",	"leak",	"lean",	"leap",	"learn",	"leave",	"leer",	"lend",	"let",	"lick",	"lie",	"lie",	"lift",	"light",	"like",	"limp",	"listen",	"live",	"look",	"lose",	"love",	"magnify",	"maintain",	"make",	"manage",	"march",	"mark",	"marry",	"mash",	"match",	"matter",	"mean",	"measure",	"meet",	"melt",	"merge",	"mew",	"migrate",	"milk",	"mind",	"mislead",	"miss",	"mistake",	"misuse",	"mix",	"moan",
"modify",	"moo",	"motivate",	"mould",	"moult",	"move",	"mow",	"multiply",	"murmur",	"nail",	"nap",	"need",	"neglect",	"nip",	"nod",	"note",	"notice",	"notify",	"nourish",	"nurse",	"obey",	"oblige",	"observe",	"obstruct",	"obtain",	"occupy",	"occur",	"offer",	"offset",	"omit",	"ooze",	"open",	"operate",	"opine",	"oppress",	"opt",	"optimize",	"order",	"organize",	"originate",	"output",	"overflow",	"overtake",	"owe",	"own",	"pacify",	"paint",	"pardon",	"part",	"partake",	"participate",	"pass",	"paste",	"pat",	"patch",	"pause",	"pay",	"peep",	"perish",	"permit",	"persuade",	"phone",	"place",	"plan",	"play",	"plead",	"please",	"plod",	"plot",	"pluck",	"ply",	"point",	"polish",	"pollute",	"ponder",	"pour",	"pout",	"practise",	"praise",	"pray",	"preach",	"prefer",	"prepare",	"prescribe",	"present",	"preserve",	"preset",	"preside",	"press",	"pretend",	"prevent",	"print",	"proceed",	"produce",	"progress",	"prohibit",	"promise",	"propose",	"prosecute",	"protect",	"prove",	"provide",	"pull",	"punish",	"purify",	"push",	"put",	"qualify",	"quarrel",	"question",	"quit",	"race",	"rain",	"rattle",	"reach",	"read",	"realize",	"rebuild",	"recall",	"recast",	"receive",	"recite",	"recognize",	"recollect",	"recur",	"redo",	"reduce",	"refer",	"reflect",	"refuse",	"regard",	"regret",	"relate",	"relax",	"rely",	"remain",	"remake",	"remove",	"rend",	"renew",	"renounce",	"repair",	"repeat",	"replace",	"reply",	"report",	"request",	"resell",	"resemble",	"reset",	"resist",	"resolve",	"respect",	"rest",	"restrain",	"retain",	"retch",	"retire",	"return",	"reuse",	"review",	"rewind",	"rid",	"ride",	"ring",	"rise",	"roar",	"rob",	"roll",	"rot",	"rub",	"rule",	"run",	"rush",	"sabotage",	"sack",	"sacrifice",	"sadden",	"saddle",	"sag",	"sail",	"sally",	"salute",	"salvage",	"salve",	"sample",	"sanctify",	"sanction",	"sap",	"saponify",	"sash",	"sashay",	"sass",	"sate",	"satiate",	"satirise",	"satisfy",	"saturate",	"saunter",	"save",	"savor",	"savvy",	"saw",	"say",	"scab",	"scabble",	"scald",	"scale",	"scam",	"scan",	"scant",	"scar",	"scare",	"scarify",	"scarp",	"scat",	"scatter",	"scold",	"scorch",	"scowl",	"scrawl",	"scream",	"screw",	"scrub",	"search",	"seat",	"secure",	"see",	"seek",	"seem",	"seize",	"select",	"sell",	"send",	"sentence",	"separate",	"set",	"sever",	"sew",	"shake",	"shape",	"share",	"shatter",	"shave",	"shear",	"shed",	"shine",	"shirk",	"shit",	"shiver",	"shock",	"shoe",	"shoot",	"shorten",	"shout",	"show",	"shrink",	"shun",	"shut",	"sight",	"signal",	"signify",	"sing",	"sink",	"sip",	"sit",	"ski",	"skid",	"slam",	"slay",	"sleep",	"slide",	"slim",	"sling",	"slink",	"slip",	"slit",	"smash",	"smell",	"smile",	"smite",	"smooth",	"smother",	"snap",	"snatch",	"sneak",	"sneeze",	"sniff",	"soar",	"sob",	"solicit",	"solve",	"soothe",	"sort",	"sow",	"sparkle",	"speak",	"speed",	"spell",	"spend",	"spill",	"spin",	"spit",	"split",	"spoil",	"spray",	"spread",	"spring",	"sprout",	"squeeze",	"stand",	"stare",	"start",	"state",	"steal",	"steep",	"stem",	"step",	"sterilize",	"stick",	"stimulate",	"sting",	"stink",	"stir",	"stitch",	"stoop",	"stop",	"store",	"strain",	"stray",	"stress",	"stretch",	"strew",	"stride",	"strike",	"string",	"strive",	"study",	"submit",	"subscribe",	"subtract",	"succeed",	"suck",	"suffer",	"suggest",	"summon",	"supply",	"support",	"suppose",	"surge",	"surmise",	"surpass",	"surround",	"survey",	"survive",	"swallow",	"sway",	"swear",	"sweat",	"sweep",	"swell",	"swim",	"swing",	"swot",	"take",	"talk",	"tap",	"taste",	"tax",	"teach",	"tear",	"tee",	"tell",	"tempt",	"tend",	"terminate",	"terrify",	"test",	"thank",	"think",	"thrive",	"throw",	"thrust",	"thump",	"tie",	"tire",	"toss",	"touch",	"train",	"trample",	"transfer",	"transform",	"translate",	"trap",	"travel",	"tread",	"treasure",	"treat",	"tree",	"tremble",	"triumph",	"trust",	"try",	"turn",	"type",	"typeset",	"understand",	"undo",	"uproot",	"upset",	"urge",	"use",	"utter",	"value",	"vanish",	"vary",	"verify",	"vex",	"vie",	"view",	"violate",	"vomit",	"wake",	"walk",	"wander",	"want",	"warn",	"waste",	"watch",	"water",	"wave",	"wax",	"waylay",	"wear",	"weave",	"wed",	"weep",	"weigh",	"welcome",	"wend",	"wet",	"whip",	"whisper",	"win",	"wind",	"wish",	"withdraw",	"work",	"worry",	"worship",	"wring",	"write",	"yawn",	"yell",	"yield",	"zinc",	"zoom",
};

   
String verb2[]={"abashes",	"abates",	"abides",	"absorbs",	"accepts",	"accompanies",	"aches",	"achieves",	"acquires",	"acts",	"adds",	"addresses",	"adjusts",	"admires",	"admits",	"advises",	"affords",	"agrees",	"alights",	"allows",	"animates",	"announces",	"answers",	"apologizes",	"appears",	"applauds",	"applies",	"approaches",	"approves",	"argues",	"arises",	"arranges",	"arrests",	"asks",	"asserts",	"assorts",	"astonishes",	"attacks",	"attends",	"attracts",	"audits",	"avoids",	"awakes",	"bangs",	"banishes",	"bashes",	"bats",	"is",	"bears",	"bears",	"beats",	"beautifies",	"becomes",	"befalls",	"begs",	"begins",	"behaves",	"beholds",	"believes",	"belongs",	"bends",	"bereaves",	"beseeches",	"bets",	"betrays",	"bids",	"bids",	"binds",	"bites",	"bleeds",	"blesses",	"blossoms",	"blows",	"blurs",	"blushes",	"boards",	"boasts",	"boils",	"bows",	"boxes",	"brays",	"breaks",	"breathes",	"breeds",	"brings",	"broadcasts",	"brushes",	"builds",	"burns",	"bursts",	"buries",	"busts",	"buys",	"buzzes",	"calculates",	"calls",	"canvasses",	"captures",	"caresses",	"carries",	"carves",	"cashes",	"casts",	"catches",	"causes",	"ceases",	"celebrates",	"challenges",	"changes",	"charges",	"chases",	"chats",	"checks",	"cheers",	"chews",	"chides",	"chips",	"chokes",	"chooses",	"classifies",	"cleans",	"cleaves",	"clicks",	"climbs",	"clings",	"closes",	"clothes",	"clutches",	"collapses",	"collects",	"colours",	"comes",	"comments",	"compares",	"compels",	"competes",	"complains",	"completes",	"concludes",	"conducts",	"confesses",	"confines",	"confiscates",	"confuses",	"congratulates",	"connects",	"connotes",	"conquers",	"consecrates",	"consents",	"conserves",	"considers",	"consigns",	"consists",	"consoles",	"consorts",	"conspires",	"constitutes",	"constrains",	"constructs",	"construes",	"consults",	"contains",	"contemns",	"contends",	"contests",	"continues",	"contracts",	"contradicts",	"contrasts",	"contributes",	"contrives",	"controls",	"convenes",	"converges",	"converses",	"converts",	"conveys",	"convicts",	"convinces",	"coos",	"cooks",	"cools",	"co-operates",	"copes",	"copies",	"corrects",	"corresponds",	"corrodes",	"corrupts",	"costs",	"coughs",	"counsels",	"counts",	"courses",	"covers",	"cowers",	"cracks",	"crackles",	"crashes",	"craves",	"creates",	"creeps",	"cribs",	"crosses",	"crowds",	"crushes",	"cries",	"curbs",	"cures",	"curves",	"cuts",	"cycles",	"damages",	"damps",	"dances",	"dares",	"dashes",	"dazzles",	"deals",	"decays",	"decides",	"declares",	"decorates",	"decreases",	"dedicates",	"delays",	"deletes",	"denies",	"depends",	"deprives",	"derives",	"describes",	"desires",	"destroys",	"detaches",	"detects",	"determines",	"develops",	"dies",	"differs",	"digs",	"digests",	"dims",	"diminishes",	"dines",	"dips",	"directs",	"disappears",	"discovers",	"discusses",	"disobeys",	"displays",	"disposes",	"distributes",	"disturbs",	"disuses",	"dives",	"divides",	"does",	"donates",	"downloads",	"drags",	"draws",	"dreams",	"dresses",	"drills",	"drinks",	"drives",	"drops",	"dries",	"dumps",	"dwells",	"dyes",	"earns",	"eats",	"educates",	"empowers",	"empties",	"encircles",	"encourages",	"encroaches",	"endangers",	"endorses",	"endures",	"engraves",	"enjoys",	"enlarges",	"enlightens",	"enters",	"envies",	"erases",	"escapes",	"evaporates",	"exchanges",	"exclaims",	"excludes",	"exists",	"expands",	"expects",	"explains",	"explores",	"expresses",	"extends",	"eyes",	"faces",	"fails",	"faints",	"falls",	"fans",	"fancies",	"favours",	"faxes",	"feeds",	"feels",	"ferries",	"fetches",	"fights",	"fills",	"finds",	"finishes",	"fishes",	"fits",	"fixes",	"fizzes",	"flaps",	"flashes",	"flees",	"flings",	"floats",	"flops",	"flies",	"folds",	"follows",	"forbids",	"forces",	"forecasts",	"foretells",	"forgets",	"forgives",	"forlese",	"forms",	"forsakes",	"founds",	"frames",	"frees",	"freezes",	"frightens",	"fries",	"fulfils",	"gags",	"gains",	"gainsays",	"gashes",	"gazes",	"gets",	"gives",	"glances",	"glitters",	"glows",	"goes",	"googles",	"governs",	"grabs",	"grades",	"grants",	"greets",	"grinds",	"grips",	"grows",	"guards",	"guesses",	"guides",	"handles",	"hangs",	"happens",	"harms",	"hatches",	"hates",	"has",	"heals",	"hears",	"heaves",	"helps",	"hews",	"hides",	"hinders",	"hisses",	"hits",	"hoaxes",	"holds",	"hops",	"hopes",	"horrifies",	"hugs",	"hums",	"humiliates",	"hunts",	"hurls",	"hurries",	"hurts",	"hushes",	"hustles",	"hypnotizes",	"idealizes",	"identifies",	"idolizes",	"ignites",	"ignores",	"ill-treats",	"illuminates",	"illumines",	"illustrates",	"imagines",	"imbibes",	"imitates",	"immerses",	"immolates",	"immures",	"impairs",	"imparts",	"impeaches",	"impedes",	"impels",	"impends",	"imperils",	"impinges",	"implants",	"implicates",	"implodes",	"implores",	"implies",	"imports",	"imposes",	"impresses",	"imprints",	"imprisons",	"improves",	"inaugurates",	"incises",	"includes",	"increases",	"inculcates",	"indents",	"indicates",	"induces",	"indulges",	"infects",	"infests",	"inflames",	"inflates",	"inflects",	"informs",	"infringes",	"infuses",	"ingests",	"inhabits",	"inhales",	"inherits",	"initiates",	"injects",	"injures",	"inlays",	"innovates",	"inputs",	"inquires",	"inscribes",	"inserts",	"inspects",	"inspires",	"installs",	"insults",	"insures",	"integrates",	"introduces",	"invents",	"invites",	"joins",	"jumps",	"justifies",	"keeps",	"kicks",	"kids",	"kills",	"kisses",	"kneels",	"knits",	"knocks",	"knows",	"lades",	"lands",	"lasts",	"latches",	"laughs",	"lays",	"leads",	"leaks",	"leans",	"leaps",	"learns",	"leaves",	"leers",	"lends",	"lets",	"licks",	"lies",	"lies",	"lifts",	"lights",	"likes",	"limps",	"listens",	"lives",	"looks",	"loses",	"loves",	"magnifies",	"maintains",	"makes",	"manages",	"marches",	"marks",	"marries",	"mashes",	"matches",	"matters",	"means",	"measures",	"meets",	"melts",	"merges",	"mews",	"migrates",	"milks",	"minds",	"misleads",	"misses",	"mistakes",	"misuses",	"mixes",	"moans",	"modifies",	"moos",	"motivates",	"moulds",	"moults",	"moves",	"mows",	"multiplies",	"murmurs",	"nails",	"naps",	"needs",	"neglects",	"nips",	"nods",	"notes",	"notices",	"notifies",	"nourishes",	"nurses",	"obeys",	"obliges",	"observes",	"obstructs",	"obtains",	"occupies",	"occurs",	"offers",	"offsets",	"omits",	"oozes",	"opens",	"operates",	"opines",	"oppresses",	"opts",	"optimizes",	"orders",	"organizes",	"originates",	"outputs",	"overflows",	"overtakes",	"owes",	"owns",	"pacifies",	"paints",	"pardons",	"parts",	"partakes",	"participates",	"passes",	"pastes",	"pats",	"patches",	"pauses",	"pays",	"peeps",	"perishes",	"permits",	"persuades",	"phones",	"places",	"plans",	"plays",	"pleads",	"pleases",	"plods",	"plots",	"plucks",	"plies",	"points",	"polishes",	"pollutes",	"ponders",	"pours",	"pouts",	"practises",	"praises",	"prays",	"preaches",	"prefers",	"prepares",	"prescribes",	"presents",	"preserves",	"presets",	"presides",	"presses",	"pretends",	"prevents",	"prints",	"proceeds",	"produces",	"progresses",	"prohibits",	"promises",	"proposes",	"prosecutes",	"protects",	"proves",	"provides",	"pulls",	"punishes",	"purifies",	"pushes",	"puts",	"qualifies",	"quarrels",	"questions",	"quits",	"races",	"rains",	"rattles",	"reaches",	"reads",	"realizes",	"rebuilds",	"recalls",	"recasts",	"receives",	"recites",	"recognizes",	"recollects",	"recurs",	"redoes",	"reduces",	"refers",	"reflects",	"refuses",	"regards",	"regrets",	"relates",	"relaxes",	"relies",	"remains",	"remakes",	"removes",	"rends",	"renews",	"renounces",	"repairs",	"repeats",	"replaces",	"replies",	"reports",	"requests",	"resells",	"resembles",	"resets",	"resists",	"resolves",	"respects",	"rests",	"restrains",	"retains",	"retches",	"retires",	"returns",	"reuses",	"reviews",	"rewinds",	"rids",	"rides",	"rings",	"rises",	"roars",	"robs",	"rolls",	"rots",	"rubs",	"rules",	"runs",	"rushes",	"sabotages",	"sacks",	"sacrifices",	"saddens",	"saddles",	"sags",	"sails",	"sallies",	"salutes",	"salvages",	"salves",	"samples",	"sanctifies",	"sanctions",	"saps",	"saponifies",	"sashes",	"sashays",	"sasses",	"sates",	"satiates",	"satirises",	"satisfies",	"saturates",	"saunters",	"saves",	"savors",	"savvies",	"saws",	"says",	"scabs",	"scabbles",	"scalds",	"scales",	"scams",	"scans",	"scants",	"scars",	"scares",	"scarifies",	"scarps",	"scats",	"scatters",	"scolds",	"scorches",	"scowls",	"scrawls",	"screams",	"screws",	"scrubs",	"searches",	"seats",	"secures",	"sees",	"seeks",	"seems",	"seizes",	"selects",	"sells",	"sends",	"sentences",	"separates",	"sets",	"severs",	"sews",	"shakes",	"shapes",	"shares",	"shatters",	"shaves",	"shears",	"sheds",	"shines",	"shirks",	"shits",	"shivers",	"shocks",	"shoes",	"shoots",	"shortens",	"shouts",	"shows",	"shrinks",	"shuns",	"shuts",	"sights",	"signals",	"signifies",	"sings",	"sinks",	"sips",	"sits",	"skis",	"skids",	"slams",	"slays",	"sleeps",	"slides",	"slims",	"slings",	"slinks",	"slips",	"slits",	"smashes",	"smells",	"smiles",	"smites",	"smoothes",	"smothers",	"snaps",	"snatches",	"sneaks",	"sneezes",	"sniffs",	"soars",	"sobs",	"solicits",	"solves",	"soothes",	"sorts",	"sows",	"sparkles",	"speaks",	"speeds",	"spells",	"spends",	"spills",	"spins",	"spits",	"splits",	"spoils",	"sprays",	"spreads",	"springs",	"sprouts",	"squeezes",	"stands",	"stares",	"starts",	"states",	"stays",	"steals",	"steeps",	"stems",	"steps",	"sterilizes",	"sticks",	"stimulates",	"stings",	"stinks",	"stirs",	"stitches",	"stoops",	"stops",	"stores",	"strains",	"strays",	"stresses",	"stretches",	"strews",	"strides",	"strikes",	"strings",	"strives",	"studies",	"submits",	"subscribes",	"subtracts",	"succeeds",	"sucks",	"suffers",	"suggests",	"summons",	"supplies",	"supports",	"supposes",	"surges",	"surmises",	"surpasses",	"surrounds",	"surveys",	"survives",	"swallows",	"sways",	"swears",	"sweats",	"sweeps",	"swells",	"swims",	"swings",	"swots",	"takes",	"talks",	"taps",	"tastes",	"taxes",	"teaches",	"tears",	"tees",	"tells",	"tempts",	"tends",	"terminates",	"terrifies",	"tests",	"thanks",	"thinks",	"thrives",	"throws",	"thrusts",	"thumps",	"ties",	"tires",	"tosses",	"touches",	"trains",	"tramples",	"transfers",	"transforms",	"translates",	"traps",	"travels",	"treads",	"treasures",	"treats",	"trees",	"trembles",	"triumphs",	"trusts",	"tries",	"turns",	"types",	"typesets",	"understands",	"undoes",	"uproots",	"upsets",	"urges",	"uses",	"utters",	"values",	"vanishes",	"varies",	"verifies",	"vexes",	"vies",	"views",	"violates",	"vomits",	"wakes",	"walks",	"wanders",	"wants",	"warns",	"wastes",	"watches",	"waters",	"waves",	"waxes",	"waylays",	"wears",	"weaves",	"weds",	"weeps",	"weighs",	"welcomes",	"wends",	"wets",	"whips",	"whispers",	"wins",	"winds",	"wishes",	"withdraws",	"works",	"worries",	"worships",	"wrings",	"writes",	"yawns",	"yells",	"yields",	"zincs",	"zooms",
};

String verb3[]={"has","have"};

String verb4[]={"is","am","are"};

String verb5[]={"had"};

String verb6[]={"was","were"};

String verb7[]={"will","shall"};

String continous[]={"abashing",	"abating",	"abiding",	"absorbing",	"accepting",	"accompanying",	"aching",	"achieving",	"acquiring",	"acting",	"adding",	"addressing",	"adjusting",	"admiring",	"admitting",	"advising",	"affording",	"agreeing",	"alighting",	"allowing",	"animating",	"announcing",	"answering",	"apologizing",	"appearing",	"applauding",	"applying",	"approaching",	"approving",	"arguing",	"arising",	"arranging",	"arresting",	"asking",	"asserting",	"assorting",	"astonishing",	"attacking",	"attending",	"attracting",	"auditing",	"avoiding",	"awaking",	"banging",	"banishing",	"bashing",	"batting",	"being",	"bearing",	"bearing",	"beating",	"beautifying",	"becoming",	"befalling",	"begging",	"beginning",	"behaving",	"beholding",	"believing",	"belonging",	"bending",	"bereaving",	"beseeching",	"betting",	"betraying",	"bidding",	"bidding",	"binding",	"biting",	"bleeding",	"blessing",	"blossoming",	"blowing",	"blurring",	"blushing",	"boarding",	"boasting",	"boiling",	"bowing",	"boxing",	"braying",	"breaking",	"breathing",	"breeding",	"bringing",	"broadcasting",	"brushing",	"building",	"burning",	"bursting",	"burying",	"busting",	"buying",	"buzzing",	"calculating",	"calling",	"canvassing",	"capturing",	"caressing",	"carrying",	"carving",	"cashing",	"casting",	"catching",	"causing",	"ceasing",	"celebrating",	"challenging",	"changing",	"charging",	"chasing",	"chatting",	"checking",	"cheering",	"chewing",	"chiding",	"chipping",	"choking",	"choosing",	"classifying",	"cleaning",	"cleaving",	"clicking",	"climbing",	"clinging",	"closing",	"clothing",	"clutching",	"collapsing",	"collecting",	"colouring",	"coming",	"commenting",	"comparing",	"compelling",	"competing",	"complaining",	"completing",	"concluding",	"conducting",	"confessing",	"confining",	"confiscating",	"confusing",	"congratulating",	"connecting",	"connoting",	"conquering",	"consecrating",	"consenting",	"conserving",	"considering",	"consigning",	"consisting",	"consoling",	"consorting",	"conspiring",	"constituting",	"constraining",	"constructing",	"construing",	"consulting",	"containing",	"contemning",	"contending",	"contesting",	"continuing",	"contracting",	"contradicting",	"contrasting",	"contributing",	"contriving",	"controlling",	"convening",	"converging",	"conversing",	"converting",	"conveying",	"convicting",	"convincing",	"cooing",	"cooking",	"cooling",	"co-operating",	"coping",	"copying",	"correcting",	"corresponding",	"corroding",	"corrupting",	"costing",	"coughing",	"counselling",	"counting",	"coursing",	"covering",	"cowering",	"cracking",	"crackling",	"crashing",	"craving",	"creating",	"creeping",	"cribbing",	"crossing",	"crowding",	"crushing",	"crying",	"curbing",	"curing",	"curving",	"cutting",	"cycling",	"damaging",	"damping",	"dancing",	"daring",	"dashing",	"dazzling",	"dealing",	"decaying",	"deciding",	"declaring",	"decorating",	"decreasing",	"dedicating",	"delaying",	"deleting",	"denying",	"depending",	"depriving",	"deriving",	"describing",	"desiring",	"destroying",	"detaching",	"detecting",	"determining",	"developing",	"dying",	"differing",	"digging",	"digesting",	"dimming",	"diminishing",	"dining",	"dipping",	"directing",	"disappearing",	"discovering",	"discussing",	"disobeying",	"displaying",	"disposing",	"distributing",	"disturbing",	"disusing",	"diving",	"dividing",	"doing",	"donating",	"downloading",	"dragging",	"drawing",	"dreaming",	"dressing",	"drilling",	"drinking",	"driving",	"dropping",	"drying",	"dumping",	"dwelling",	"dyeing",	"earning",	"eating",	"educating",	"empowering",	"emptying",	"encircling",	"encouraging",	"encroaching",	"entangling",	"endorsing",	"enduring",	"engraving",	"enjoying",	"enlarging",	"enlightening",	"entering",	"envying",	"erasing",	"escaping",	"evaporating",	"exchanging",	"exclaiming",	"excluding",	"existing",	"expanding",	"expecting",	"explaining",	"exploring",	"expressing",	"extending",	"eyeing",	"facing",	"failing",	"fainting",	"falling",	"fanning",	"fancying",	"favouring",	"faxing",	"feeding",	"feeling",	"ferrying",	"fetching",	"fighting",	"filling",	"finding",	"finishing",	"fishing",	"fitting",	"fixing",	"fizzing",	"flapping",	"flashing",	"fleeing",	"flinging",	"floating",	"flopping",	"flying",	"folding",	"following",	"forbidding",	"forcing",	"forecasting",	"foretelling",	"forgetting",	"forgiving",	"forlesing",	"forming",	"forsaking",	"founding",	"framing",	"freeing",	"freezing",	"frightening",	"frying",	"fulfilling",	"gagging",	"gaining",	"gainsaying",	"gashing",	"gazing",	"getting",	"giving",	"glancing",	"glittering",	"glowing",	"going",	"googling",	"governing",	"grabbing",	"grading",	"granting",	"greeting",	"grinding",	"gripping",	"growing",	"guarding",	"guessing",	"guiding",	"handling",	"hanging",	"happening",	"harming",	"hatching",	"hating",	"having",	"healing",	"hearing",	"heaving",	"helping",	"hewing",	"hiding",	"hindering",	"hissing",	"hitting",	"hoaxing",	"holding",	"hopping",	"hoping",	"horrifying",	"hugging",	"humming",	"humiliating",	"hunting",	"hurling",	"hurrying",	"hurting",	"hushing",	"hustling",	"hypnotizing",	"idealizing",	"identifying",	"idolizing",	"igniting",	"ignoring",	"ill-treating",	"illuminating",	"illumining",	"illustrating",	"imagining",	"imbibing",	"imitating",	"immersing",	"immolating",	"immuring",	"impairing",	"imparting",	"impeaching",	"impeding",	"impelling",	"impending",	"imperilling",	"impinging",	"implanting",	"implicating",	"imploding",	"imploring",	"implying",	"importing",	"imposing",	"impressing",	"imprinting",	"imprisoning",	"improving",	"inaugurating",	"incising",	"including",	"increasing",	"inculcating",	"indenting",	"indicating",	"inducing",	"indulging",	"infecting",	"infesting",	"inflaming",	"inflating",	"inflecting",	"informing",	"infringing",	"infusing",	"ingesting",	"inhabiting",	"inhaling",	"inheriting",	"initiating",	"injecting",	"injuring",	"inlaying",	"innovating",	"inputting",	"inquiring",	"inscribing",	"inserting",	"inspecting",	"inspiring",	"installing",	"insulting",	"insuring",	"integrating",	"introducing",	"inventing",	"inviting",	"joining",	"jumping",	"justifying",	"keeping",	"kicking",	"kidding",	"killing",	"kissing",	"kneeling",	"knitting",	"knocking",	"knowing",	"lading",	"landing",	"lasting",	"latching",	"laughing",	"laying",	"leading",	"leaking",	"leaning",	"leaping",	"learning",	"leaving",	"leering",	"lending",	"letting",	"licking",	"lying",	"lying",	"lifting",	"lighting",	"liking",	"limping",	"listening",	"living",	"looking",	"losing",	"loving",	"magnifying",	"maintaining",	"making",	"managing",	"marching",	"marking",	"marrying",	"mashing",	"matching",	"mattering",	"meaning",	"measuring",	"meeting",	"melting",	"merging",	"mewing",	"migrating",	"milking",	"minding",	"misleading",	"missing",	"mistaking",	"misusing",	"mixing",	"moaning",	"modifying",	"mooing",	"motivating",	"moulding",	"moulting",	"moving",	"mowing",	"multiplying",	"murmuring",	"nailing",	"napping",	"needing",	"neglecting",	"nipping",	"nodding",	"noting",	"noticing",	"notifying",	"nourishing",	"nursing",	"obeying",	"obliging",	"observing",	"obstructing",	"obtaining",	"occupying",	"occurring",	"offering",	"offsetting",	"omitting",	"oozing",	"opening",	"operating",	"opining",	"oppressing",	"opting",	"optimizing",	"ordering",	"organizing",	"originating",	"outputting",	"overflowing",	"overtaking",	"owing",	"owning",	"pacifying",	"painting",	"pardoning",	"parting",	"partaking",	"participating",	"passing",	"pasting",	"patting",	"patching",	"pausing",	"paying",	"peeping",	"perishing",	"permitting",	"persuading",	"phoning",	"placing",	"planning",	"playing",	"pleading",	"pleasing",	"plodding",	"plotting",	"plucking",	"plying",	"pointing",	"polishing",	"polluting",	"pondering",	"pouring",	"pouting",	"practising",	"praising",	"praying",	"preaching",	"preferring",	"preparing",	"prescribing",	"presenting",	"preserving",	"presetting",	"presiding",	"pressing",	"pretending",	"preventing",	"printing",	"proceeding",	"producing",	"progressing",	"prohibiting",	"promising",	"proposing",	"prosecuting",	"protecting",	"proving",	"providing",	"pulling",	"punishing",	"purifying",	"pushing",	"putting",	"qualifying",	"quarrelling",	"questioning",	"quitting",	"racing",	"raining",	"rattling",	"reaching",	"reading",	"realizing",	"rebuilding",	"recalling",	"recasting",	"receiving",	"reciting",	"recognizing",	"recollecting",	"recurring",	"redoing",	"reducing",	"referring",	"reflecting",	"refusing",	"regarding",	"regretting",	"relating",	"relaxing",	"relying",	"remaining",	"remaking",	"removing",	"rending",	"renewing",	"renouncing",	"repairing",	"repeating",	"replacing",	"replying",	"reporting",	"requesting",	"reselling",	"resembling",	"resetting",	"resisting",	"resolving",	"respecting",	"resting",	"restraining",	"retaining",	"retching",	"retiring",	"returning",	"reusing",	"reviewing",	"rewinding",	"ridding",	"riding",	"ringing",	"rising",	"roaring",	"robbing",	"rolling",	"rotting",	"rubbing",	"ruling",	"running",	"rushing",	"sabotaging",	"sacking",	"sacrificing",	"saddening",	"saddling",	"sagging",	"sailing",	"sallying",	"saluting",	"salvaging",	"salving",	"sampling",	"sanctifying",	"sanctioning",	"sapping",	"saponifying",	"sashing",	"sashaying",	"sassing",	"sating",	"satiating",	"satirising",	"satisfying",	"saturating",	"sauntering",	"saving",	"savoring",	"savvying",	"sawing",	"saying",	"scabbing",	"scabbling",	"scalding",	"scaling",	"scamming",	"scanning",	"scanting",	"scarring",	"scaring",	"scarifying",	"scarping",	"scatting",	"scattering",	"scolding",	"scorching",	"scowling",	"scrawling",	"screaming",	"screwing",	"scrubbing",	"searching",	"seating",	"securing",	"seeing",	"seeking",	"seeming",	"seizing",	"selecting",	"selling",	"sending",	"sentencing",	"separating",	"setting",	"severing",	"sewing",	"shaking",	"shaping",	"sharing",	"shattering",	"shaving",	"shearing",	"shedding",	"shining",	"shirking",	"shitting",	"shivering",	"shocking",	"shoeing",	"shooting",	"shortening",	"shouting",	"showing",	"shrinking",	"shunning",	"shutting",	"sighting",	"signalling",	"signifying",	"singing",	"sinking",	"sipping",	"sitting",	"skiing",	"skidding",	"slamming",	"slaying",	"sleeping",	"sliding",	"slimming",	"slinging",	"slinking",	"slipping",	"slitting",	"smashing",	"smelling",	"smiling",	"smiting",	"smoothing",	"smothering",	"snapping",	"snatching",	"sneaking",	"sneezing",	"sniffing",	"soaring",	"sobbing",	"soliciting",	"solving",	"soothing",	"sorting",	"sowing",	"sparkling",	"speaking",	"speeding",	"spelling",	"spending",	"spilling",	"spinning",	"spitting",	"splitting",	"spoiling",	"spraying",	"spreading",	"springing",	"sprouting",	"squeezing",	"standing",	"staring",	"starting",	"stating",	"staying",	"stealing",	"steeping",	"stemming",	"stepping",	"sterilizing",	"sticking",	"stimulating",	"stinging",	"stinking",	"stirring",	"stitching",	"stooping",	"stopping",	"storing",	"straining",	"straying",	"stressing",	"stretching",	"strewing",	"striding",	"striking",	"stringing",	"striving",	"studying",	"submitting",	"subscribing",	"subtracting",	"succeeding",	"sucking",	"suffering",	"suggesting",	"summoning",	"supplying",	"supporting",	"supposing",	"surging",	"surmising",	"surpassing",	"surrounding",	"surveying",	"surviving",	"swallowing",	"swaying",	"swearing",	"sweating",	"sweeping",	"swelling",	"swimming",	"swinging",	"swotting",	"taking",	"talking",	"tapping",	"tasting",	"taxing",	"teaching",	"tearing",	"teeing",	"telling",	"tempting",	"tending",	"terminating",	"terrifying",	"testing",	"thanking",	"thinking",	"thriving",	"throwing",	"thrusting",	"thumping",	"tying",	"tiring",	"tossing",	"touching",	"training",	"trampling",	"transferring",	"transforming",	"translating",	"trapping",	"travelling",	"treading",	"treasuring",	"treating",	"treeing",	"trembling",	"triumphing",	"trusting",	"trying",	"turning",	"typing",	"typesetting",	"understanding",	"undoing",	"uprooting",	"upsetting",	"urging",	"using",	"uttering",	"valuing",	"vanishing",	"varying",	"verifying",	"vexing",	"vying",	"viewing",	"violating",	"vomiting",	"waking",	"walking",	"wandering",	"wanting",	"warning",	"wasting",	"watching",	"watering",	"waving",	"waxing",	"waylaying",	"wearing",	"weaving",	"wedding",	"weeping",	"weighing",	"welcoming",	"wending",	"wetting",	"whipping",	"whispering",	"winning",	"winding",	"wishing",	"withdrawing",	"working",	"worrying",	"worshipping",	"wringing",	"writing",	"yawning",	"yelling",	"yielding",	"zincking",	"zooming",
};

String past_partcipile[]={"abashed",	"abated",	"abode",	"absorbed",	"accepted",	"accompanied",	"ached",	"achieved",	"acquired",	"acted",	"added",	"addressed",	"adjusted",	"admired",	"admitted",	"advised",	"afforded",	"agreed",	"alit",	"allowed",	"animated",	"announced",	"answered",	"apologized",	"appeared",	"applauded",	"applied",	"approached",	"approved",	"argued",	"arisen",	"arranged",	"arrested",	"asked",	"asserted",	"assorted",	"astonished",	"attacked",	"attended",	"attracted",	"audited",	"avoided",	"awoken",	"banged",	"banished",	"bashed",	"batted",	"been",	"born",	"borne",	"beaten",	"beautified",	"become",	"befallen",	"begged",	"begun",	"behaved",	"beheld",	"believed",	"belonged",	"bent",	"bereft",	"besought",	"bet",	"betrayed",	"bidden",	"bid",	"bound",	"bitten",	"bled",	"blessed",	"blossomed",	"blown",	"blurred",	"blushed",	"boarded",	"boasted",	"boiled",	"bowed",	"boxed",	"brayed",	"broken",	"breathed",	"bred",	"brought",	"broadcast",	"brushed",	"built",	"burnt",	"burst",	"buried",	"bust",	"bought",	"buzzed",	"calculated",	"called",	"canvassed",	"captured",	"caressed",	"carried",	"carved",	"cashed",	"cast",	"caught",	"caused",	"ceased",	"celebrated",	"challenged",	"changed",	"charged",	"chased",	"chatted",	"checked",	"cheered",	"chewed",	"chid/chidden",	"chipped",	"choked",	"chosen",	"classified",	"cleaned",	"cloven/cleft",	"clicked",	"climbed",	"clung",	"closed",	"clad",	"clutched",	"collapsed",	"collected",	"coloured",	"come",	"commented",	"compared",	"compelled",	"competed",	"complained",	"completed",	"concluded",	"conducted",	"confessed",	"confined",	"confiscated",	"confused",	"congratulated",	"connected",	"connoted",	"conquered",	"consecrated",	"consented",	"conserved",	"considered",	"consigned",	"consisted",	"consoled",	"consorted",	"conspired",	"constituted",	"constrained",	"constructed",	"construed",	"consulted",	"contained",	"contemned",	"contended",	"contested",	"continued",	"contracted",	"contradicted",	"contrasted",	"contributed",	"contrived",	"controlled",	"convened",	"converged",	"conversed",	"converted",	"conveyed",	"convicted",	"convinced",	"cooed",	"cooked",	"cooled",	"co-operated",	"cope",	"copied",	"corrected",	"corresponded",	"corroded",	"corrupted",	"cost",	"coughed",	"counselled",	"counted",	"coursed",	"covered",	"cowered",	"cracked",	"crackled",	"crashed",	"craved",	"created",	"crept",	"cribbed",	"crossed",	"crowded",	"crushed",	"cried",	"curbed",	"cured",	"curved",	"cut",	"cycled",	"damaged",	"damped",	"danced",	"dared",	"dashed",	"dazzled",	"dealt",	"decayed",	"decided",	"declared",	"decorated",	"decreased",	"dedicated",	"delayed",	"deleted",	"denied",	"depended",	"deprived",	"derived",	"described",	"desired",	"destroyed",	"detached",	"detected",	"determined",	"developed",	"died",	"differed",	"dug",	"digested",	"dimmed",	"diminished",	"dined",	"dipped",	"directed",	"disappeared",	"discovered",	"discussed",	"disobeyed",	"displayed",	"disposed",	"distributed",	"disturbed",	"disused",	"dived",	"divided",	"done",	"donated",	"downloaded",	"dragged",	"drawn",	"dreamt",	"dressed",	"drilled",	"drunk",	"driven",	"dropped",	"dried",	"dumped",	"dwelt",	"dyed",	"earned",	"eaten",	"educated",	"empowered",	"emptied",	"encircled",	"encouraged",	"encroached",	"endangered",	"endorsed",	"endured",	"engraved",	"enjoyed",	"enlarged",	"enlightened",	"entered",	"envied",	"erased",	"escaped",	"evaporated",	"exchanged",	"exclaimed",	"excluded",	"existed",	"expanded",	"expected",	"explained",	"explored",	"expressed",	"extended",	"eyed",	"faced",	"failed",	"fainted",	"fallen",	"fanned",	"fancied",	"favoured",	"faxed",	"fed",	"felt",	"ferried",	"fetched",	"fought",	"filled",	"found",	"finished",	"fished",	"fit/fitted",	"fixed",	"fizzed",	"flapped",	"flashed",	"fled",	"flung",	"floated",	"flopped",	"flown",	"folded",	"followed",	"forbidden",	"forced",	"forecast",	"foretold",	"forgotten",	"forgiven",	"forlorn",	"formed",	"forsaken",	"founded",	"framed",	"freed",	"frozen",	"frightened",	"fried",	"fulfilled",	"gagged",	"gained",	"gainsaid",	"gashed",	"gazed",	"got",	"given",	"glanced",	"glittered",	"glowed",	"gone",	"googled",	"governed",	"grabbed",	"graded",	"granted",	"greeted",	"ground",	"gripped",	"grown",	"guarded",	"guessed",	"guided",	"handled",	"hung",	"happened",	"harmed",	"hatched",	"hated",	"had",	"healed",	"heard",	"hove",	"helped",	"hewn",	"hidden",	"hindered",	"hissed",	"hit",	"hoaxed",	"held",	"hopped",	"hoped",	"horrified",	"hugged",	"hummed",	"humiliated",	"hunted",	"hurled",	"hurried",	"hurt",	"hushed",	"hustled",	"hypnotized",	"idealized",	"identified",	"idolized",	"ignited",	"ignored",	"ill-treated",	"illuminated",	"illumined",	"illustrated",	"imagined",	"imbibed",	"imitated",	"immersed",	"immolated",	"immured",	"impaired",	"imparted",	"impeached",	"impeded",	"impelled",	"impended",	"imperilled",	"impinged",	"implanted",	"implicated",	"imploded",	"implored",	"implied",	"imported",	"imposed",	"impressed",	"imprinted",	"imprisoned",	"improved",	"inaugurated",	"incised",	"included",	"increased",	"inculcated",	"indented",	"indicated",	"induced",	"indulged",	"infected",	"infested",	"inflamed",	"inflated",	"inflected",	"informed",	"infringed",	"infused",	"ingested",	"inhabited",	"inhaled",	"inherited",	"initiated",	"injected",	"injured",	"inlaid",	"innovated",	"input",	"inquired",	"inscribed",	"inserted",	"inspected",	"inspired",	"installed",	"insulted",	"insured",	"integrated",	"introduced",	"invented",	"invited",	"joined",	"jumped",	"justified",	"kept",	"kicked",	"kidded",	"killed",	"kissed",	"knelt",	"knit",	"knocked",	"known",	"laden",	"landed",	"lasted",	"latched",	"laughed",	"laid",	"led",	"leaked",	"leant",	"leapt",	"learnt",	"left",	"leered",	"lent",	"let",	"licked",	"lain",	"lied",	"lifted",	"lit",	"liked",	"limped",	"listened",	"lived",	"looked",	"lost",	"loved",	"magnified",	"maintained",	"made",	"managed",	"marched",	"marked",	"married",	"mashed",	"matched",	"mattered",	"meant",	"measured",	"met",	"melted",	"merged",	"mewed",	"migrated",	"milked",	"minded",	"misled",	"missed",	"mistaken",	"misused",	"mixed",	"moaned",	"modified",	"mooed",	"motivated",	"moulded",	"moulted",	"moved",	"mown",	"multiplied",	"murmured",	"nailed",	"napped",	"needed",	"neglected",	"nipped",	"nodded",	"noted",	"noticed",	"notified",	"nourished",	"nursed",	"obeyed",	"obliged",	"observed",	"obstructed",	"obtained",	"occupied",	"occurred",	"offered",	"offset",	"omitted",	"oozed",	"opened",	"operated",	"opined",	"oppressed",	"opted",	"optimized",	"ordered",	"organized",	"originated",	"output",	"overflowed",	"overtaken",	"owed",	"owned",	"pacified",	"painted",	"pardoned",	"parted",	"partaken",	"participated",	"passed",	"pasted",	"patted",	"patched",	"paused",	"paid",	"peeped",	"perished",	"permitted",	"persuaded",	"phoned",	"placed",	"planned",	"played",	"pled",	"pleased",	"plodded",	"plotted",	"plucked",	"plied",	"pointed",	"polished",	"polluted",	"pondered",	"poured",	"pouted",	"practised",	"praised",	"prayed",	"preached",	"preferred",	"prepared",	"prescribed",	"presented",	"preserved",	"preset",	"presided",	"pressed",	"pretended",	"prevented",	"printed",	"proceeded",	"produced",	"progressed",	"prohibited",	"promised",	"proposed",	"prosecuted",	"protected",	"proved",	"provided",	"pulled",	"punished",	"purified",	"pushed",	"put",	"qualified",	"quarrelled",	"questioned",	"quit",	"raced",	"rained",	"rattled",	"reached",	"read",	"realized",	"rebuilt",	"recalled",	"recast",	"received",	"recited",	"recognized",	"recollected",	"recurred",	"redone",	"reduced",	"referred",	"reflected",	"refused",	"regarded",	"regretted",	"related",	"relaxed",	"relied",	"remained",	"remade",	"removed",	"rent",	"renewed",	"renounced",	"repaired",	"repeated",	"replaced",	"replied",	"reported",	"requested",	"resold",	"resembled",	"reset",	"resisted",	"resolved",	"respected",	"rested",	"restrained",	"retained",	"retched",	"retired",	"returned",	"reused",	"reviewed",	"rewound",	"rid",	"ridden",	"rung",	"risen",	"roared",	"robbed",	"rolled",	"rotted",	"rubbed",	"ruled",	"run",	"rushed",	"sabotaged",	"sacked",	"sacrificed",	"saddened",	"saddled",	"sagged",	"sailed",	"sallied",	"saluted",	"salvaged",	"salved",	"sampled",	"sanctified",	"sanctioned",	"sapped",	"saponified",	"sashed",	"sashayed",	"sassed",	"sated",	"satiated",	"satirised",	"satisfied",	"saturated",	"sauntered",	"saved",	"savored",	"savvied",	"sawn",	"said",	"scabbed",	"scabbled",	"scalded",	"scaled",	"scammed",	"scanned",	"scanted",	"scarred",	"scared",	"scarified",	"scarped",	"scatted",	"scattered",	"scolded",	"scorched",	"scowled",	"scrawled",	"screamed",	"screwed",	"scrubbed",	"searched",	"seated",	"secured",	"seen",	"sought",	"seemed",	"seized",	"selected",	"sold",	"sent",	"sentenced",	"separated",	"set",	"severed",	"sewn",	"shaken",	"shaped",	"shared",	"shattered",	"shaven",	"shorn",	"shed",	"shone",	"shirked",	"shit",	"shivered",	"shocked",	"shod",	"shot",	"shortened",	"shouted",	"shown",	"shrunk",	"shunned",	"shut",	"sighted",	"signalled",	"signified",	"sung",	"sunk",	"sipped",	"sat",	"skied",	"skidded",	"slammed",	"slain",	"slept",	"slid/slide",	"slimmed",	"slung",	"slunk",	"slipped",	"slit",	"smashed",	"smelt",	"smiled",	"smitten",	"smoothed",	"smothered",	"snapped",	"snatched",	"sneaked",	"sneezed",	"sniffed",	"soared",	"sobbed",	"solicited",	"solved",	"soothed",	"sorted",	"sowed",	"sparkled",	"spoken",	"sped",	"spelt",	"spent",	"spilt",	"spun",	"spat/spit",	"split",	"spoilt",	"sprayed",	"spread",	"sprung",	"sprouted",	"squeezed",	"stood",	"stared",	"started",	"stated",	"stayed",	"stolen",	"steeped",	"stemmed",	"stepped",	"sterilized",	"stuck",	"stimulated",	"stung",	"stunk",	"stirred",	"stitched",	"stooped",	"stopped",	"stored",	"strained",	"strayed",	"stressed",	"stretched",	"strewn",	"stridden",	"struck/stricken",	"strung",	"striven",	"studied",	"submitted",	"subscribed",	"subtracted",	"succeeded",	"sucked",	"suffered",	"suggested",	"summoned",	"supplied",	"supported",	"supposed",	"surged",	"surmised",	"surpassed",	"surrounded",	"surveyed",	"survived",	"swallowed",	"swayed",	"sworn",	"sweat",	"swept",	"swollen",	"swum",	"swung",	"swotted",	"taken",	"talked",	"tapped",	"tasted",	"taxed",	"taught",	"torn",	"teed",	"told",	"tempted",	"tended",	"terminated",	"terrified",	"tested",	"thanked",	"thought",	"thriven",	"thrown",	"thrust",	"thumped",	"tied",	"tired",	"tossed",	"touched",	"trained",	"trampled",	"transferred",	"transformed",	"translated",	"trapped",	"travelled",	"trodden",	"treasured",	"treated",	"treed",	"trembled",	"triumphed",	"trusted",	"tried",	"turned",	"typed",	"typeset",	"understood",	"undone",	"uprooted",	"upset",	"urged",	"used",	"uttered",	"valued",	"vanished",	"varied",	"verified",	"vexed",	"vied",	"viewed",	"violated",	"vomited",	"woken",	"walked",	"wandered",	"wanted",	"warned",	"wasted",	"watched",	"watered",	"waved",	"waxed",	"waylaid",	"worn",	"woven",	"wed",	"wept",	"weighed",	"welcomed",	"went",	"wet",	"whipped",	"whispered",	"won",	"wound",	"wished",	"withdrawn",	"worked",	"worried",	"worshipped",	"wrung",	"written",	"yawned",	"yelled",	"yielded",	"zincked",	"zoomed",};


String past[]={"abashed",	"abated",	"abode",	"absorbed",	"accepted",	"accompanied",	"ached",	"achieved",	"acquired",	"acted",	"added",	"addressed",	"adjusted",	"admired",	"admitted",	"advised",	"afforded",	"agreed",	"alit",	"allowed",	"animated",	"announced",	"answered",	"apologized",	"appeared",	"applauded",	"applied",	"approached",	"approved",	"argued",	"arose",	"arranged",	"arrested",	"asked",	"asserted",	"assorted",	"astonished",	"attacked",	"attended",	"attracted",	"audited",	"avoided",	"awoke",	"banged",	"banished",	"bashed",	"batted",	"was / were",	"bore",	"bore",	"beat",	"beautified",	"became",	"befell",	"begged",	"began",	"behaved",	"beheld",	"believed",	"belonged",	"bent",	"bereft",	"besought",	"bet",	"betrayed",	"bade",	"bid",	"bound",	"bit",	"bled",	"blessed",	"blossomed",	"blew",	"blurred",	"blushed",	"boarded",	"boasted",	"boiled",	"bowed",	"boxed",	"brayed",	"broke",	"breathed",	"bred",	"brought",	"broadcast",	"brushed",	"built",	"burnt",	"burst",	"buried",	"bust",	"bought",	"buzzed",	"calculated",	"called",	"canvassed",	"captured",	"caressed",	"carried",	"carved",	"cashed",	"cast",	"caught",	"caused",	"ceased",	"celebrated",	"challenged",	"changed",	"charged",	"chased",	"chatted",	"checked",	"cheered",	"chewed",	"chid",	"chipped",	"choked",	"chose",	"classified",	"cleaned",	"clove/cleft",	"clicked",	"climbed",	"clung",	"closed",	"clad",	"clutched",	"collapsed",	"collected",	"coloured",	"came",	"commented",	"compared",	"compelled",	"competed",	"complained",	"completed",	"concluded",	"conducted",	"confessed",	"confined",	"confiscated",	"confused",	"congratulated",	"connected",	"connoted",	"conquered",	"consecrated",	"consented",	"conserved",	"considered",	"consigned",	"consisted",	"consoled",	"consorted",	"conspired",	"constituted",	"constrained",	"constructed",	"construed",	"consulted",	"contained",	"contemned",	"contended",	"contested",	"continued",	"contracted",	"contradicted",	"contrasted",	"contributed",	"contrived",	"controlled",	"convened",	"converged",	"conversed",	"converted",	"conveyed",	"convicted",	"convinced",	"cooed",	"cooked",	"cooled",	"co-operated",	"coped",	"copied",	"corrected",	"corresponded",	"corroded",	"corrupted",	"cost",	"coughed",	"counselled",	"counted",	"coursed",	"covered",	"cowered",	"cracked",	"crackled",	"crashed",	"craved",	"created",	"crept",	"cribbed",	"crossed",	"crowded",	"crushed",	"cried",	"curbed",	"cured",	"curved",	"cut",	"cycled",	"damaged",	"damped",	"danced",	"dared",	"dashed",	"dazzled",	"dealt",	"decayed",	"decided",	"declared",	"decorated",	"decreased",	"dedicated",	"delayed",	"deleted",	"denied",	"depended",	"deprived",	"derived",	"described",	"desired",	"destroyed",	"detached",	"detected",	"determined",	"developed",	"died",	"differed",	"dug",	"digested",	"dimmed",	"diminished",	"dined",	"dipped",	"directed",	"disappeared",	"discovered",	"discussed",	"disobeyed",	"displayed",	"disposed",	"distributed",	"disturbed",	"disused",	"dived",	"divided",	"did",	"donated",	"downloaded",	"dragged",	"drew",	"dreamt",	"dressed",	"drilled",	"drank",	"drove",	"dropped",	"dried",	"dumped",	"dwelt",	"dyed",	"earned",	"ate",	"educated",	"empowered",	"emptied",	"encircled",	"encouraged",	"encroached",	"endangered",	"endorsed",	"endured",	"engraved",	"enjoyed",	"enlarged",	"enlightened",	"entered",	"envied",	"erased",	"escaped",	"evaporated",	"exchanged",	"exclaimed",	"excluded",	"existed",	"expanded",	"expected",	"explained",	"explored",	"expressed",	"extended",	"eyed",	"faced",	"failed",	"fainted",	"fell",	"fanned",	"fancied",	"favoured",	"faxed",	"fed",	"felt",	"ferried",	"fetched",	"fought",	"filled",	"found",	"finished",	"fished",	"fit/fitted",	"fixed",	"fizzed",	"flapped",	"flashed",	"fled",	"flung",	"floated",	"flopped",	"flew",	"folded",	"followed",	"forbade",	"forced",	"forecast",	"foretold",	"forgot",	"forgave",	"forlore",	"formed",	"forsook",	"founded",	"framed",	"freed",	"froze",	"frightened",	"fried",	"fulfilled",	"gagged",	"gained",	"gainsaid",	"gashed",	"gazed",	"got",	"gave",	"glanced",	"glittered",	"glowed",	"went",	"googled",	"governed",	"grabbed",	"graded",	"granted",	"greeted",	"ground",	"gripped",	"grew",	"guarded",	"guessed",	"guided",	"handled",	"hung",	"happened",	"harmed",	"hatched",	"hated",	"had",	"healed",	"heard",	"hove",	"helped",	"hewed",	"hid",	"hindered",	"hissed",	"hit",	"hoaxed",	"held",	"hopped",	"hoped",	"horrified",	"hugged",	"hummed",	"humiliated",	"hunted",	"hurled",	"hurried",	"hurt",	"hushed",	"hustled",	"hypnotized",	"idealized",	"identified",	"idolized",	"ignited",	"ignored",	"ill-treated",	"illuminated",	"illumined",	"illustrated",	"imagined",	"imbibed",	"imitated",	"immersed",	"immolated",	"immured",	"impaired",	"imparted",	"impeached",	"impeded",	"impelled",	"impended",	"imperilled",	"impinged",	"implanted",	"implicated",	"imploded",	"implored",	"implied",	"imported",	"imposed",	"impressed",	"imprinted",	"imprisoned",	"improved",	"inaugurated",	"incised",	"included",	"increased",	"inculcated",	"indented",	"indicated",	"induced",	"indulged",	"infected",	"infested",	"inflamed",	"inflated",	"inflected",	"informed",	"infringed",	"infused",	"ingested",	"inhabited",	"inhaled",	"inherited",	"initiated",	"injected",	"injured",	"inlaid",	"innovated",	"input",	"inquired",	"inscribed",	"inserted",	"inspected",	"inspired",	"installed",	"insulted",	"insured",	"integrated",	"introduced",	"invented",	"invited",	"joined",	"jumped",	"justified",	"kept",	"kicked",	"kidded",	"killed",	"kissed",	"knelt",	"knit",	"knocked",	"knew",	"laded",	"landed",	"lasted",	"latched",	"laughed",	"laid",	"led",	"leaked",	"leant",	"leapt",	"learnt",	"left",	"leered",	"lent",	"let",	"licked",	"lay",	"lied",	"lifted",	"lit",	"liked",	"limped",	"listened",	"lived",	"looked",	"lost",	"loved",	"magnified",	"maintained",	"made",	"managed",	"marched",	"marked",	"married",	"mashed",	"matched",	"mattered",	"meant",	"measured",	"met",	"melted",	"merged",	"mewed",	"migrated",	"milked",	"minded",	"misled",	"missed",	"mistook",	"misused",	"mixed",	"moaned",	"modified",	"mooed",	"motivated",	"moulded",	"moulted",	"moved",	"mowed",	"multiplied",	"murmured",	"nailed",	"napped",	"needed",	"neglected",	"nipped",	"nodded",	"noted",	"noticed",	"notified",	"nourished",	"nursed",	"obeyed",	"obliged",	"observed",	"obstructed",	"obtained",	"occupied",	"occurred",	"offered",	"offset",	"omitted",	"oozed",	"opened",	"operated",	"opined",	"oppressed",	"opted",	"optimized",	"ordered",	"organized",	"originated",	"output",	"overflowed",	"overtook",	"owed",	"owned",	"pacified",	"painted",	"pardoned",	"parted",	"partook",	"participated",	"passed",	"pasted",	"patted",	"patched",	"paused",	"paid",	"peeped",	"perished",	"permitted",	"persuaded",	"phoned",	"placed",	"planned",	"played",	"pled",	"pleased",	"plodded",	"plotted",	"plucked",	"plied",	"pointed",	"polished",	"polluted",	"pondered",	"poured",	"pouted",	"practised",	"praised",	"prayed",	"preached",	"preferred",	"prepared",	"prescribed",	"presented",	"preserved",	"preset",	"presided",	"pressed",	"pretended",	"prevented",	"printed",	"proceeded",	"produced",	"progressed",	"prohibited",	"promised",	"proposed",	"prosecuted",	"protected",	"proved",	"provided",	"pulled",	"punished",	"purified",	"pushed",	"put",	"qualified",	"quarrelled",	"questioned",	"quit",	"raced",	"rained",	"rattled",	"reached",	"read",	"realized",	"rebuilt",	"recalled",	"recast",	"received",	"recited",	"recognized",	"recollected",	"recurred",	"redid",	"reduced",	"referred",	"reflected",	"refused",	"regarded",	"regretted",	"related",	"relaxed",	"relied",	"remained",	"remade",	"removed",	"rent",	"renewed",	"renounced",	"repaired",	"repeated",	"replaced",	"replied",	"reported",	"requested",	"resold",	"resembled",	"reset",	"resisted",	"resolved",	"respected",	"rested",	"restrained",	"retained",	"retched",	"retired",	"returned",	"reused",	"reviewed",	"rewound",	"rid",	"rode",	"rang",	"rose",	"roared",	"robbed",	"rolled",	"rotted",	"rubbed",	"ruled",	"ran",	"rushed",	"sabotaged",	"sacked",	"sacrificed",	"saddened",	"saddled",	"sagged",	"sailed",	"sallied",	"saluted",	"salvaged",	"salved",	"sampled",	"sanctified",	"sanctioned",	"sapped",	"saponified",	"sashed",	"sashayed",	"sassed",	"sated",	"satiated",	"satirised",	"satisfied",	"saturated",	"sauntered",	"saved",	"savored",	"savvied",	"sawed",	"said",	"scabbed",	"scabbled",	"scalded",	"scaled",	"scammed",	"scanned",	"scanted",	"scarred",	"scared",	"scarified",	"scarped",	"scatted",	"scattered",	"scolded",	"scorched",	"scowled",	"scrawled",	"screamed",	"screwed",	"scrubbed",	"searched",	"seated",	"secured",	"saw",	"sought",	"seemed",	"seized",	"selected",	"sold",	"sent",	"sentenced",	"separated",	"set",	"severed",	"sewed",	"shook",	"shaped",	"shared",	"shattered",	"shove",	"shore",	"shed",	"shone",	"shirked",	"shit",	"shivered",	"shocked",	"shod",	"shot",	"shortened",	"shouted",	"showed",	"shrank",	"shunned",	"shut",	"sighted",	"signalled",	"signified",	"sang",	"sank",	"sipped",	"sat",	"skied",	"skidded",	"slammed",	"slew",	"slept",	"slid",	"slimmed",	"slung",	"slunk",	"slipped",	"slit",	"smashed",	"smelt",	"smiled",	"smote",	"smoothed",	"smothered",	"snapped",	"snatched",	"sneaked",	"sneezed",	"sniffed",	"soared",	"sobbed",	"solicited",	"solved",	"soothed",	"sorted",	"sowed",	"sparkled",	"spoke",	"sped",	"spelt",	"spent",	"spilt",	"span/spun",	"spat/spit",	"split",	"spoilt",	"sprayed",	"spread",	"sprang",	"sprouted",	"squeezed",	"stood",	"stared",	"started",	"stated",	"stayed",	"stole",	"steeped",	"stemmed",	"stepped",	"sterilized",	"stuck",	"stimulated",	"stung",	"stank",	"stirred",	"stitched",	"stooped",	"stopped",	"stored",	"strained",	"strayed",	"stressed",	"stretched",	"strewed",	"strode",	"struck",	"strung",	"strove",	"studied",	"submitted",	"subscribed",	"subtracted",	"succeeded",	"sucked",	"suffered",	"suggested",	"summoned",	"supplied",	"supported",	"supposed",	"surged",	"surmised",	"surpassed",	"surrounded",	"surveyed",	"survived",	"swallowed",	"swayed",	"swore",	"sweat",	"swept",	"swelled",	"swam",	"swung",	"swotted",	"took",	"talked",	"tapped",	"tasted",	"taxed",	"taught",
"tore",	"teed",	"told",	"tempted",	"tended",	"terminated",	"terrified",	"tested",	"thanked",	"thought",	"throve",	"threw",	"thrust",	"thumped",	"tied",	"tired",	"tossed",	"touched",	"trained",	"trampled",	"transferred",	"transformed",	"translated",	"trapped",	"travelled",	"trod",	"treasured",	"treated",	"treed",	"trembled",	"triumphed",	"trusted",	"tried",	"turned",	"typed",	"typeset",	"understood",	"undid",	"uprooted",	"upset",	"urged",	"used",	"uttered",	"valued",	"vanished",	"varied",	"verified",	"vexed",	"vied",	"viewed",	"violated",	"vomited",	"woke",	"walked",	"wandered",	"wanted",	"warned",	"wasted",	"watched",	"watered",	"waved",	"waxed",	"waylaid",	"wore",	"wove",	"wed",	"wept",	"weighed",	"welcomed",	"went",	"wet",	"whipped",	"whispered",	"won",	"wound",	"wished",	"withdrew",	"worked",	"worried",	"worshipped",	"wrung",	"wrote",	"yawned",	"yelled",	"yielded",	"zincked",	"zoomed",
};

String interrogative[]={"What", "Which", "When", "Where", "Who", "Whom", "Whose", "Why", "Whether",  "How"};
String exclamation[]={"Wow",	"Brilliant",	"Awesome"	,"Ouch"	,"Amazing","	Bravo",	"Fantastic","	Tremendous",	"Sheesh",	"Geronimo",	"Timber","Hooray",	"Wowsers",	"Gosh"	,"Jeepers","	Magnificent",	"Unbelievable"};

String sub[]={"I","We","You","They"};

String str;

public String sen_type="null";

String words[];

      public void input()
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("TYPE THE SENTENCE");
          str=sc.nextLine();
          words=str.split(" ");
          
          
      }
            public void check_punctuation()
            {
                if(Character.isLowerCase(str.charAt(0)))
                {
                    System.err.println("ERR : FIRST WORD MUST BE CAPITAL");
                }
                for(int i=0;i<interrogative.length;i++)
                {
                    if(words[0].contains(interrogative[i]))
                    {
                      if(str.endsWith("?"))
                      {
                          
                      }
                      else
                      {
                          System.err.println("ERROR : ENDS WITH A QUESTION MARK(?)");
                      }
                    }
                }
                for(int i=0;i<(words.length-1);i++)
                {
                    for(int j=0;j<(exclamation.length);j++)
                    {
                        if(words[i].contains(exclamation[j]))
                        {
                            System.err.println("ERROR :SENTENCE MUST CONTAIN A EXCLAMATION MARK(!) ");
                        }
                    }
                }
                if(str.endsWith("."))
                {
                    
                }
                else
                {
                    System.err.println("ERROR : SENTENCE ENDS WITH FULL-STOP(.)");
                }
            }
          
           
               public void check_tenses()
               {             //FOR PRESENT TENSE
                
                
                
                    for(int i=0;i<(words.length-1);i++)//simple present //for I,we,they,we
                {
                    for(int j=0;j<verb1.length;j++)
                    {
                        if(words[i].contains(verb1[j]))
                        {
                            {for(int l=0;l<(words.length-1);l++)
                            {
                                for(int h=0;h<sub.length;h++)
                                { 
                                    if(words[l].equals(sub[h]))
                                    {
                                         sen_type="Simple present tense. ";
                                         break;
                                    }
                                    
                                    
                        
                                }
                        
                        
                            }
                        }
                        
                    }
                    }
                    
                
                
                }
                for(int i=0;i<(words.length-1);i++)//simple present//other than sub[]
                {
                    for(int j=0;j<verb2.length;j++)
                    {
                        if(words[i].equals(verb2[j])&&(words[i]!="by"))
                        {
                             for(int l=0;l<(words.length-1);l++)
                             {
                               for(int h=0;h<sub.length;h++)
                               {
                                   if(words[l].contains(sub[h]))
                                           {
                                              sen_type="error";
                                              
                                           }
                                   else{
                                       sen_type="simple present tense ";
                                       
                                       
                                   }
                                   
                               }
                             }
                        }
                       
                    }
                }
                    
                    for (int k=0;k<(words.length-1);k++) //present perfect 
                    {
                        for(int j=0;j<verb3.length;j++)
                        {
                            if(words[k].contains(verb3[j]))
                            {
                                for(int l=0;l<(words.length-1);l++)
                             {
                               for(int h=0;h<past_partcipile.length;h++)
                               {
                                   if(words[l].contains(past_partcipile[h]))
                                   {
                                       sen_type="present perfect tense";
                                   }
                                }
                              }
                              } 
                        
                        }
                    }
                     for (int k=0;k<(words.length-1);k++) //continous
                    {
                        for(int j=0;j<verb4.length;j++)
                            {
                                if(words[k].contains(verb4[j]))
                            {
                                  for(int l=0;l<(words.length-1);l++)
                                {
                                    for(int h=0;h<continous.length;h++)
                                   {
                                       if(words[l].contains(continous[h]))
                                       {
                                           sen_type="present continous tense";
                                       }
                                    }

                                }
                            }
                        }
                    }
                     for (int k=0;k<(words.length-1);k++) //perfect continous
                    {
                        for(int j=0;j<verb3.length;j++)
                            {
                              if(words[k].contains(verb3[j]))
                              {
                                  if("been".equals(words[k+1]))
                                  {
                                      for(int m=0;m<(words.length-1);m++)
                                      {
                                          for(int n=0;n<continous.length;n++)
                                          {
                                              if(words[m].contains(continous[n]))
                                              {
                                                  sen_type="present  perfect continous tense";
                                                  break;
                                              }
                                          }
                                      }
                                  }
                                  
                                  
                              }
                            }
                     
                    }
                     //FOR PAST TENSE
                      for (int k=0;k<(words.length-1);k++) // simple past
                    {
                        for(int j=0;j<past.length;j++)
                            {
                                if(words[k].contains(past[j]))
                                {
                                    sen_type="simple past";
                                    
                                }
                            }
                      }
                       for (int k=0;k<(words.length-1);k++)//perfect past
                       {
                           if(words[k].contains("had"))
                           {
                               for(int m=0;m<(words.length-1);m++)
                               {
                                   for(int i=0;i<past_partcipile.length;i++)
                                   {
                                       if(words[m].contains(past_partcipile[i]))
                                       {
                                           sen_type="past perfect tense";
                                       }
                                   }
                               }
                           }
                       }
                        for (int k=0;k<(words.length-1);k++)//past perfect continous
                        {
                            for(int m=0;m<verb5.length;m++)
                            {
                                if(words[k].contains(verb5[m]))
                                {
                                    if("been".equals(words[k+1]))
                                    {
                                        for(int a=0;a<(words.length-1);a++)
                                        {
                                            for(int b=0;b<continous.length;b++)
                                            {
                                                if(words[a].contains(continous[b]))
                                                {
                                                    sen_type="past perfect continous";
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            
                        }
                        for (int k=0;k<(words.length-1);k++)//past  continous
                        {
                            for(int m=0;m<verb6.length;m++)
                            {
                                if(words[k].contains(verb6[m]))
                                {
                                    for(int a=0;a<continous.length;a++)
                                    {
                                        if(words[k+1].contains(continous[a]))
                                        {
                                            sen_type="past continous";
                                        }
                                    }
                                    
                                       
                                        
                                        
                                        
                                }
                                
                            }
                        }
                        //FUTURE TENSE
                        for(int i=0;i<(words.length-1);i++)//simple future
                        {
                            for(int a=0;a<verb7.length;a++)
                            {
                                if(words[i].contains(verb7[a]))
                                {
                                    
                                        for(int h=0;h<verb1.length;h++)
                                        {
                                           if(words[i+1].contains(verb1[h]))
                                           {
                                               sen_type="simple future";
                                           }
                                        }
                                               
                                }
                                    
                            
                        
                        
                                if(words[i].contains(verb7[a]))
                                {
                                  for(int g=0;g<(words.length-1);g++){
                                        for(int c=0;c< past_partcipile.length;c++)
                                        {
                                            if(words[g].contains( past_partcipile[c]))
                                            {
                                                sen_type="future perfect";
                                            }
                                        }
                                    }
                                    
                                }
                            
                        
                        
                                if(words[i].contains(verb7[a]))
                                {
                                if("be".equals(words[i+1]))
                                    {
                                      for(int u=0;u<(words.length-1);u++)
                                      {  
                                    
                                       for(int k=0;k<continous.length;k++)
                                       {
                                           if(words[u].contains(continous[k]))
                                           {
                                               sen_type="future continous ";
                                           }
                                       }
                                    }
                            }
                        }
                        
                        
                        
                       
                              if(words[i].contains(verb7[a]))
                              {
                                  if(words[i+1]=="have")
                                  {
                                      if(words[i+2]=="been")
                                      {
                                          for(int k=0;i<(words.length-1);i++)
                                          {
                                              for(int w=0;w<continous.length;w++)
                                              {
                                                  if(words[i].contains(continous[w]))
                                                  {
                                                      sen_type="future perfect continous";
                                                  }
                                              }
                                          }
                                      }
                                  }
                              }
                            }
                        }
                  
                
                        //FOR PASSIVE SENTENSES
                        
                        for(int i=0;i<(words.length-1);i++)
                        {
                            if(words[i].contains("by"))
                            {   
                               for(int j=0;j<(words.length-1);j++)//simple present
                               {
                                   for(int k=0;k<past.length;k++)
                                   {
                                       if(words[j].contains(past[k]))
                                       {
                                           for(int t=0;t<(words.length-1);t++)
                                           {
                                               if(words[t].contains("being"))
                                               {
                                                   sen_type="present continous in passive voice";
                                               }
                                               else if(words[t].contains("have"))
                                               {
                                                  if(words[t+1].contains("been"))
                                                  {
                                                      sen_type="present perfect in passive voice";
                                                  }
                                               }
                                               else
                                                   sen_type="simple present tense in passive voice";
                                           }
                                       }
                                      
                                       
                                   }
                                   for(int u=0;u< past_partcipile.length;u++)
                                   {
                                       for(int p=0;p<(words.length-1);p++)
                                       {
                                           if(words[p].contains("has"))
                                           {
                                               if(words[p+1].contains("been"))
                                               {
                                                   sen_type="present perfect continous in active voice";
                                               }
                                           }
                                       }
                                   }
                               }
                               //FOR PAST TENSE IN PASSIVE VOICE
                               for(int r=0;r<(words.length-1);r++)
                               {
                                   if(words[r].contains("was")||words[r].contains("were"))
                                   {
                                       if(words[r+1].contains("being"))
                                       {
                                           sen_type="past continous in passive voice";
                                       }
                                   }
                                   else if(words[r].contains("had"))
                                   {
                                       if(words[r+1].contains(("been")))
                                       {
                                           sen_type="past perfect in passive voice";
                                       }
                                       else
                                           sen_type="simpe past in passive voice";
                                   }
                               }
                               for (int u=0;u<(words.length-1);u++)
                               {
                                   if(words[u].equals("will"))
                                   {
                                       if(words[u+1].contains("be"))
                                       {
                                           sen_type="simple future in pasive voice";
                                       }
                                       else if(words[u+1].contains("have"))
                                       {
                                           if(words[u+2].contains("been"))
                                           {
                                               sen_type="future perfect in passive voice";
                                           }
                                       }
                                       
                                   }
                               }
                               
                               
                               
                               
                               
                            }
                            
                        }
                        
                        
                        
            }
}


                        
                            
                            
                            
                        
                    
                      
         





    

