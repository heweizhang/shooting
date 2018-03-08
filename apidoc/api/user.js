/**
 * @apiDefine api_succeed 操作成功
 * @apiSuccessExample {json} 操作成功
 * {"c":0,"m":"ok","d": {}}
 */

/**
 * @apiDefine api_fail 操作失败
 * @apiSuccessExample {json} 操作失败
 * {"c":-1,"m":"失败原因","d": null}
 */

/**
 * @apiDefine api_response
 * @apiSuccess {integer} c 成功：0
 * @apiSuccess {String} m  error_message
 * @apiSuccess {jsonObject} d  success_result
 */

/**
 *
 * @api {post} /api/v1/user/loginCheck 1、loginCheck 登录验证
 * @apiGroup User
 * @apiVersion 1.0.0
 * @apiParam {string} account 账号
 * @apiParam {string} psw 密码
 * @apiUse api_response
 * @apiUse api_succeed
 * @apiUse api_fail
 */


/**
 * @api {post} /api/v1/user/register  2、register 注册账号
 * @apiGroup User
 * @apiVersion 1.0.0
 * @apiParam {string} account 账号
 * @apiParam {string} psw 密码
 * @apiUse api_response
 * @apiUse api_succeed
 * @apiUse api_fail
 */