module.exports = { // meetcollege
  PROJECT_COLOR: '#339900',
  NAV_COLOR: '#ffffff',
  NAV_BG: '#339900',

  // setup
  SETUP_CONTENT_ITEMS: [
    { title: '关于我们', key: 'SETUP_CONTENT_ABOUT' },
    { title: '用户注册使用协议', key: 'SETUP_YS' }
  ],

  // 用户 
  USER_FIELDS: [
    { mark: 'sex', title: '性别', type: 'select', selectOptions: ['男', '女'], must: true },
    { mark: 'birth', type: 'date', title: '出生年月', must: true },
    { mark: 'inyear', type: 'year', title: '入学年份', must: true },
    { mark: 'xueli', title: '就读类型', type: 'select', selectOptions: ['专科', '本科', '硕士研究生', '博士研究生', '其他'], must: true },
    { mark: 'study', type: 'text', title: '就读院系', must: true },
    { mark: 'room', type: 'text', title: '宿舍楼栋', must: false },
  ],


  NEWS_NAME: '公告',
  NEWS_CATE: [
    { id: 1, title: '本校概况' },
    { id: 2, title: '教育教学' },
    { id: 3, title: '学院系所' },
    { id: 4, title: '科研创新' },
    { id: 5, title: '招生就业' },
    { id: 6, title: '学生天地' },
    { id: 7, title: '合作交流' },
  ],
  NEWS_FIELDS: [
    { mark: 'desc', type: 'textarea', title: '简介', must: true, min: 2, max: 200 },
    { mark: 'content', title: '详细内容', type: 'content', must: true },
    { mark: 'cover', type: 'image', title: '封面图', must: true, min: 1, max: 1 },
  ],


  MEET_NAME: '活动',
  MEET_CATE: [
    { id: 1, title: '学术讲座报名' },
    { id: 2, title: '校园活动报名' },

  ],
  MEET_FIELDS: [
    { mark: 'cover', title: '封面图', type: 'image', min: 1, max: 1, must: true },
    { mark: 'time', title: '预约时段设置', type: 'rows', ext: { titleName: '时段', maxCnt: 15, minCnt: 1 }, must: false },
    { mark: 'desc', title: '预约须知', type: 'content', must: true },
  ],
  MEET_JOIN_FIELDS: [
    { mark: 'name', type: 'text', title: '姓名', must: true, max: 30 },
    { mark: 'phone', type: 'mobile', title: '手机', must: true, edit: false }
  ],


}