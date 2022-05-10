/*
 * Copyright 2018 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.redis.client;

import io.vertx.codegen.annotations.VertxGen;
import io.vertx.redis.client.impl.CommandImpl;
import io.vertx.redis.client.impl.KeyLocator;
import io.vertx.redis.client.impl.keys.*;

/**
 * <b>Auto generated</b> API Commands to interact with REDIS.
 *
 * @author <a href="mailto:plopes@redhat.com">Paulo Lopes</a>
 * @version redis_version:7.0.0
 */
@VertxGen
public interface Command {

  Command ACL = new CommandImpl("acl", -2, null, false, false);
  Command APPEND = new CommandImpl("append", 3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command ASKING = new CommandImpl("asking", 1, null, false, false);
  Command AUTH = new CommandImpl("auth", -2, null, false, false);
  Command BGREWRITEAOF = new CommandImpl("bgrewriteaof", 1, null, false, false);
  Command BGSAVE = new CommandImpl("bgsave", -1, null, false, false);
  Command BITCOUNT = new CommandImpl("bitcount", -2, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command BITFIELD = new CommandImpl("bitfield", -2, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command BITFIELD_RO = new CommandImpl("bitfield_ro", -2, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command BITOP = new CommandImpl("bitop", -4, false, false, false, new KeyLocator(false, new BeginSearchIndex(2), new FindKeysRange(0, 1, 0)), new KeyLocator(true, new BeginSearchIndex(3), new FindKeysRange(-1, 1, 0)));
  Command BITPOS = new CommandImpl("bitpos", -3, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command BLMOVE = new CommandImpl("blmove", 6, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)), new KeyLocator(false, new BeginSearchIndex(2), new FindKeysRange(0, 1, 0)));
  Command BLMPOP = new CommandImpl("blmpop", -5, false, false, false, new KeyLocator(false, new BeginSearchIndex(2), new FindKeysKeynum(0, 1, 1)));
  Command BLPOP = new CommandImpl("blpop", -3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(-2, 1, 0)));
  Command BRPOP = new CommandImpl("brpop", -3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(-2, 1, 0)));
  Command BRPOPLPUSH = new CommandImpl("brpoplpush", 4, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)), new KeyLocator(false, new BeginSearchIndex(2), new FindKeysRange(0, 1, 0)));
  Command BZMPOP = new CommandImpl("bzmpop", -5, false, false, false, new KeyLocator(false, new BeginSearchIndex(2), new FindKeysKeynum(0, 1, 1)));
  Command BZPOPMAX = new CommandImpl("bzpopmax", -3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(-2, 1, 0)));
  Command BZPOPMIN = new CommandImpl("bzpopmin", -3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(-2, 1, 0)));
  Command CLIENT = new CommandImpl("client", -2, null, false, false);
  Command CLUSTER = new CommandImpl("cluster", -2, null, false, false);
  Command COMMAND = new CommandImpl("command", -1, null, false, false);
  Command CONFIG = new CommandImpl("config", -2, null, false, false);
  Command COPY = new CommandImpl("copy", -3, false, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)), new KeyLocator(false, new BeginSearchIndex(2), new FindKeysRange(0, 1, 0)));
  Command DBSIZE = new CommandImpl("dbsize", 1, true, false, false);
  Command DEBUG = new CommandImpl("debug", -2, null, false, false);
  Command DECR = new CommandImpl("decr", 2, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command DECRBY = new CommandImpl("decrby", 3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command DEL = new CommandImpl("del", -2, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(-1, 1, 0)));
  Command DISCARD = new CommandImpl("discard", 1, null, false, false);
  Command DUMP = new CommandImpl("dump", 2, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command ECHO = new CommandImpl("echo", 2, null, false, false);
  Command EVAL = new CommandImpl("eval", -3, null, false, false, new KeyLocator(false, new BeginSearchIndex(2), new FindKeysKeynum(0, 1, 1)));
  Command EVALSHA = new CommandImpl("evalsha", -3, null, false, false, new KeyLocator(false, new BeginSearchIndex(2), new FindKeysKeynum(0, 1, 1)));
  Command EVALSHA_RO = new CommandImpl("evalsha_ro", -3, null, false, false, new KeyLocator(true, new BeginSearchIndex(2), new FindKeysKeynum(0, 1, 1)));
  Command EVAL_RO = new CommandImpl("eval_ro", -3, null, false, false, new KeyLocator(true, new BeginSearchIndex(2), new FindKeysKeynum(0, 1, 1)));
  Command EXEC = new CommandImpl("exec", 1, null, false, false);
  Command EXISTS = new CommandImpl("exists", -2, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(-1, 1, 0)));
  Command EXPIRE = new CommandImpl("expire", -3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command EXPIREAT = new CommandImpl("expireat", -3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command EXPIRETIME = new CommandImpl("expiretime", 2, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command FAILOVER = new CommandImpl("failover", -1, null, false, false);
  Command FCALL = new CommandImpl("fcall", -3, null, false, false, new KeyLocator(false, new BeginSearchIndex(2), new FindKeysKeynum(0, 1, 1)));
  Command FCALL_RO = new CommandImpl("fcall_ro", -3, null, false, false, new KeyLocator(true, new BeginSearchIndex(2), new FindKeysKeynum(0, 1, 1)));
  Command FLUSHALL = new CommandImpl("flushall", -1, false, false, false);
  Command FLUSHDB = new CommandImpl("flushdb", -1, false, false, false);
  Command FUNCTION = new CommandImpl("function", -2, null, false, false);
  Command GEOADD = new CommandImpl("geoadd", -5, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command GEODIST = new CommandImpl("geodist", -4, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command GEOHASH = new CommandImpl("geohash", -2, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command GEOPOS = new CommandImpl("geopos", -2, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command GEORADIUS = new CommandImpl("georadius", -6, false, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)), new KeyLocator(false, new BeginSearchKeyword("STORE", 6), new FindKeysRange(0, 1, 0)), new KeyLocator(false, new BeginSearchKeyword("STOREDIST", 6), new FindKeysRange(0, 1, 0)));
  Command GEORADIUSBYMEMBER = new CommandImpl("georadiusbymember", -5, false, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)), new KeyLocator(false, new BeginSearchKeyword("STORE", 5), new FindKeysRange(0, 1, 0)), new KeyLocator(false, new BeginSearchKeyword("STOREDIST", 5), new FindKeysRange(0, 1, 0)));
  Command GEORADIUSBYMEMBER_RO = new CommandImpl("georadiusbymember_ro", -5, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command GEORADIUS_RO = new CommandImpl("georadius_ro", -6, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command GEOSEARCH = new CommandImpl("geosearch", -7, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command GEOSEARCHSTORE = new CommandImpl("geosearchstore", -8, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)), new KeyLocator(true, new BeginSearchIndex(2), new FindKeysRange(0, 1, 0)));
  Command GET = new CommandImpl("get", 2, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command GETBIT = new CommandImpl("getbit", 3, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command GETDEL = new CommandImpl("getdel", 2, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command GETEX = new CommandImpl("getex", -2, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command GETRANGE = new CommandImpl("getrange", 4, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command GETSET = new CommandImpl("getset", 3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command HDEL = new CommandImpl("hdel", -3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command HELLO = new CommandImpl("hello", -1, null, false, false);
  Command HEXISTS = new CommandImpl("hexists", 3, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command HGET = new CommandImpl("hget", 3, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command HGETALL = new CommandImpl("hgetall", 2, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command HINCRBY = new CommandImpl("hincrby", 4, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command HINCRBYFLOAT = new CommandImpl("hincrbyfloat", 4, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command HKEYS = new CommandImpl("hkeys", 2, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command HLEN = new CommandImpl("hlen", 2, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command HMGET = new CommandImpl("hmget", -3, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command HMSET = new CommandImpl("hmset", -4, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command HRANDFIELD = new CommandImpl("hrandfield", -2, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command HSCAN = new CommandImpl("hscan", -3, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command HSET = new CommandImpl("hset", -4, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command HSETNX = new CommandImpl("hsetnx", 4, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command HSTRLEN = new CommandImpl("hstrlen", 3, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command HVALS = new CommandImpl("hvals", 2, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command INCR = new CommandImpl("incr", 2, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command INCRBY = new CommandImpl("incrby", 3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command INCRBYFLOAT = new CommandImpl("incrbyfloat", 3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command INFO = new CommandImpl("info", -1, null, false, false);
  Command KEYS = new CommandImpl("keys", 2, true, false, false);
  Command LASTSAVE = new CommandImpl("lastsave", 1, null, false, false);
  Command LATENCY = new CommandImpl("latency", -2, null, false, false);
  Command LCS = new CommandImpl("lcs", -3, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(1, 1, 0)));
  Command LINDEX = new CommandImpl("lindex", 3, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command LINSERT = new CommandImpl("linsert", 5, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command LLEN = new CommandImpl("llen", 2, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command LMOVE = new CommandImpl("lmove", 5, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)), new KeyLocator(false, new BeginSearchIndex(2), new FindKeysRange(0, 1, 0)));
  Command LMPOP = new CommandImpl("lmpop", -4, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysKeynum(0, 1, 1)));
  Command LOLWUT = new CommandImpl("lolwut", -1, true, false, false);
  Command LPOP = new CommandImpl("lpop", -2, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command LPOS = new CommandImpl("lpos", -3, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command LPUSH = new CommandImpl("lpush", -3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command LPUSHX = new CommandImpl("lpushx", -3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command LRANGE = new CommandImpl("lrange", 4, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command LREM = new CommandImpl("lrem", 4, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command LSET = new CommandImpl("lset", 4, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command LTRIM = new CommandImpl("ltrim", 4, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command MEMORY = new CommandImpl("memory", -2, null, false, false);
  Command MGET = new CommandImpl("mget", -2, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(-1, 1, 0)));
  Command MIGRATE = new CommandImpl("migrate", -6, false, false, false, new KeyLocator(false, new BeginSearchIndex(3), new FindKeysRange(0, 1, 0)), new KeyLocator(false, new BeginSearchKeyword("KEYS", -2), new FindKeysRange(-1, 1, 0)));
  Command MODULE = new CommandImpl("module", -2, null, false, false);
  Command MONITOR = new CommandImpl("monitor", 1, null, false, false);
  Command MOVE = new CommandImpl("move", 3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command MSET = new CommandImpl("mset", -3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(-1, 2, 0)));
  Command MSETNX = new CommandImpl("msetnx", -3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(-1, 2, 0)));
  Command MULTI = new CommandImpl("multi", 1, null, false, false);
  Command OBJECT = new CommandImpl("object", -2, null, false, false);
  Command PERSIST = new CommandImpl("persist", 2, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command PEXPIRE = new CommandImpl("pexpire", -3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command PEXPIREAT = new CommandImpl("pexpireat", -3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command PEXPIRETIME = new CommandImpl("pexpiretime", 2, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command PFADD = new CommandImpl("pfadd", -2, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command PFCOUNT = new CommandImpl("pfcount", -2, true, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(-1, 1, 0)));
  Command PFDEBUG = new CommandImpl("pfdebug", -3, false, false, false, new KeyLocator(false, new BeginSearchIndex(2), new FindKeysRange(0, 1, 0)));
  Command PFMERGE = new CommandImpl("pfmerge", -2, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)), new KeyLocator(true, new BeginSearchIndex(2), new FindKeysRange(-1, 1, 0)));
  Command PFSELFTEST = new CommandImpl("pfselftest", 1, null, false, false);
  Command PING = new CommandImpl("ping", -1, null, false, false);
  Command PSETEX = new CommandImpl("psetex", 4, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command PSUBSCRIBE = new CommandImpl("psubscribe", -2, null, true, false);
  Command PSYNC = new CommandImpl("psync", -3, null, false, false);
  Command PTTL = new CommandImpl("pttl", 2, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command PUBLISH = new CommandImpl("publish", 3, null, false, false);
  Command PUBSUB = new CommandImpl("pubsub", -2, null, false, false);
  Command PUNSUBSCRIBE = new CommandImpl("punsubscribe", -1, null, true, false);
  Command QUIT = new CommandImpl("quit", -1, null, false, false);
  Command RANDOMKEY = new CommandImpl("randomkey", 1, true, false, false);
  Command READONLY = new CommandImpl("readonly", 1, null, false, false);
  Command READWRITE = new CommandImpl("readwrite", 1, null, false, false);
  Command RENAME = new CommandImpl("rename", 3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)), new KeyLocator(false, new BeginSearchIndex(2), new FindKeysRange(0, 1, 0)));
  Command RENAMENX = new CommandImpl("renamenx", 3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)), new KeyLocator(false, new BeginSearchIndex(2), new FindKeysRange(0, 1, 0)));
  Command REPLCONF = new CommandImpl("replconf", -1, null, false, false);
  Command REPLICAOF = new CommandImpl("replicaof", 3, null, false, false);
  Command RESET = new CommandImpl("reset", 1, null, false, false);
  Command RESTORE = new CommandImpl("restore", -4, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command RESTORE_ASKING = new CommandImpl("restore-asking", -4, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command ROLE = new CommandImpl("role", 1, null, false, false);
  Command RPOP = new CommandImpl("rpop", -2, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command RPOPLPUSH = new CommandImpl("rpoplpush", 3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)), new KeyLocator(false, new BeginSearchIndex(2), new FindKeysRange(0, 1, 0)));
  Command RPUSH = new CommandImpl("rpush", -3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command RPUSHX = new CommandImpl("rpushx", -3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command SADD = new CommandImpl("sadd", -3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command SAVE = new CommandImpl("save", 1, null, false, false);
  Command SCAN = new CommandImpl("scan", -2, true, false, false);
  Command SCARD = new CommandImpl("scard", 2, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command SCRIPT = new CommandImpl("script", -2, null, false, false);
  Command SDIFF = new CommandImpl("sdiff", -2, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(-1, 1, 0)));
  Command SDIFFSTORE = new CommandImpl("sdiffstore", -3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)), new KeyLocator(true, new BeginSearchIndex(2), new FindKeysRange(-1, 1, 0)));
  Command SELECT = new CommandImpl("select", 2, null, false, false);
  Command SET = new CommandImpl("set", -3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command SETBIT = new CommandImpl("setbit", 4, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command SETEX = new CommandImpl("setex", 4, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command SETNX = new CommandImpl("setnx", 3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command SETRANGE = new CommandImpl("setrange", 4, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command SHUTDOWN = new CommandImpl("shutdown", -1, null, false, false);
  Command SINTER = new CommandImpl("sinter", -2, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(-1, 1, 0)));
  Command SINTERCARD = new CommandImpl("sintercard", -3, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysKeynum(0, 1, 1)));
  Command SINTERSTORE = new CommandImpl("sinterstore", -3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)), new KeyLocator(true, new BeginSearchIndex(2), new FindKeysRange(-1, 1, 0)));
  Command SISMEMBER = new CommandImpl("sismember", 3, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command SLAVEOF = new CommandImpl("slaveof", 3, null, false, false);
  Command SLOWLOG = new CommandImpl("slowlog", -2, null, false, false);
  Command SMEMBERS = new CommandImpl("smembers", 2, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command SMISMEMBER = new CommandImpl("smismember", -3, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command SMOVE = new CommandImpl("smove", 4, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)), new KeyLocator(false, new BeginSearchIndex(2), new FindKeysRange(0, 1, 0)));
  Command SORT = new CommandImpl("sort", -2, false, false, true, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command SORT_RO = new CommandImpl("sort_ro", -2, true, false, true, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command SPOP = new CommandImpl("spop", -2, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command SPUBLISH = new CommandImpl("spublish", 3, null, true, false, new KeyLocator(null, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command SRANDMEMBER = new CommandImpl("srandmember", -2, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command SREM = new CommandImpl("srem", -3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command SSCAN = new CommandImpl("sscan", -3, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command SSUBSCRIBE = new CommandImpl("ssubscribe", -2, null, true, false, new KeyLocator(null, new BeginSearchIndex(1), new FindKeysRange(-1, 1, 0)));
  Command STRLEN = new CommandImpl("strlen", 2, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command SUBSCRIBE = new CommandImpl("subscribe", -2, null, true, false);
  Command SUBSTR = new CommandImpl("substr", 4, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command SUNION = new CommandImpl("sunion", -2, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(-1, 1, 0)));
  Command SUNIONSTORE = new CommandImpl("sunionstore", -3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)), new KeyLocator(true, new BeginSearchIndex(2), new FindKeysRange(-1, 1, 0)));
  Command SUNSUBSCRIBE = new CommandImpl("sunsubscribe", -1, null, true, false, new KeyLocator(null, new BeginSearchIndex(1), new FindKeysRange(-1, 1, 0)));
  Command SWAPDB = new CommandImpl("swapdb", 3, false, false, false);
  Command SYNC = new CommandImpl("sync", 1, null, false, false);
  Command TIME = new CommandImpl("time", 1, null, false, false);
  Command TOUCH = new CommandImpl("touch", -2, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(-1, 1, 0)));
  Command TTL = new CommandImpl("ttl", 2, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command TYPE = new CommandImpl("type", 2, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command UNLINK = new CommandImpl("unlink", -2, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(-1, 1, 0)));
  Command UNSUBSCRIBE = new CommandImpl("unsubscribe", -1, null, true, false);
  Command UNWATCH = new CommandImpl("unwatch", 1, null, false, false);
  Command WAIT = new CommandImpl("wait", 3, null, false, false);
  Command WATCH = new CommandImpl("watch", -2, null, false, false, new KeyLocator(null, new BeginSearchIndex(1), new FindKeysRange(-1, 1, 0)));
  Command XACK = new CommandImpl("xack", -4, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command XADD = new CommandImpl("xadd", -5, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command XAUTOCLAIM = new CommandImpl("xautoclaim", -6, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command XCLAIM = new CommandImpl("xclaim", -6, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command XDEL = new CommandImpl("xdel", -3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command XGROUP = new CommandImpl("xgroup", -2, null, false, false);
  Command XINFO = new CommandImpl("xinfo", -2, null, false, false);
  Command XLEN = new CommandImpl("xlen", 2, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command XPENDING = new CommandImpl("xpending", -3, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command XRANGE = new CommandImpl("xrange", -4, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command XREAD = new CommandImpl("xread", -4, true, false, false, new KeyLocator(true, new BeginSearchKeyword("STREAMS", 1), new FindKeysRange(-1, 1, 2)));
  Command XREADGROUP = new CommandImpl("xreadgroup", -7, false, false, false, new KeyLocator(true, new BeginSearchKeyword("STREAMS", 4), new FindKeysRange(-1, 1, 2)));
  Command XREVRANGE = new CommandImpl("xrevrange", -4, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command XSETID = new CommandImpl("xsetid", -3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command XTRIM = new CommandImpl("xtrim", -4, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command ZADD = new CommandImpl("zadd", -4, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command ZCARD = new CommandImpl("zcard", 2, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command ZCOUNT = new CommandImpl("zcount", 4, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command ZDIFF = new CommandImpl("zdiff", -3, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysKeynum(0, 1, 1)));
  Command ZDIFFSTORE = new CommandImpl("zdiffstore", -4, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)), new KeyLocator(true, new BeginSearchIndex(2), new FindKeysKeynum(0, 1, 1)));
  Command ZINCRBY = new CommandImpl("zincrby", 4, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command ZINTER = new CommandImpl("zinter", -3, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysKeynum(0, 1, 1)));
  Command ZINTERCARD = new CommandImpl("zintercard", -3, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysKeynum(0, 1, 1)));
  Command ZINTERSTORE = new CommandImpl("zinterstore", -4, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)), new KeyLocator(true, new BeginSearchIndex(2), new FindKeysKeynum(0, 1, 1)));
  Command ZLEXCOUNT = new CommandImpl("zlexcount", 4, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command ZMPOP = new CommandImpl("zmpop", -4, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysKeynum(0, 1, 1)));
  Command ZMSCORE = new CommandImpl("zmscore", -3, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command ZPOPMAX = new CommandImpl("zpopmax", -2, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command ZPOPMIN = new CommandImpl("zpopmin", -2, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command ZRANDMEMBER = new CommandImpl("zrandmember", -2, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command ZRANGE = new CommandImpl("zrange", -4, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command ZRANGEBYLEX = new CommandImpl("zrangebylex", -4, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command ZRANGEBYSCORE = new CommandImpl("zrangebyscore", -4, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command ZRANGESTORE = new CommandImpl("zrangestore", -5, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)), new KeyLocator(true, new BeginSearchIndex(2), new FindKeysRange(0, 1, 0)));
  Command ZRANK = new CommandImpl("zrank", 3, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command ZREM = new CommandImpl("zrem", -3, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command ZREMRANGEBYLEX = new CommandImpl("zremrangebylex", 4, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command ZREMRANGEBYRANK = new CommandImpl("zremrangebyrank", 4, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command ZREMRANGEBYSCORE = new CommandImpl("zremrangebyscore", 4, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command ZREVRANGE = new CommandImpl("zrevrange", -4, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command ZREVRANGEBYLEX = new CommandImpl("zrevrangebylex", -4, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command ZREVRANGEBYSCORE = new CommandImpl("zrevrangebyscore", -4, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command ZREVRANK = new CommandImpl("zrevrank", 3, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command ZSCAN = new CommandImpl("zscan", -3, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command ZSCORE = new CommandImpl("zscore", 3, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)));
  Command ZUNION = new CommandImpl("zunion", -3, true, false, false, new KeyLocator(true, new BeginSearchIndex(1), new FindKeysKeynum(0, 1, 1)));
  Command ZUNIONSTORE = new CommandImpl("zunionstore", -4, false, false, false, new KeyLocator(false, new BeginSearchIndex(1), new FindKeysRange(0, 1, 0)), new KeyLocator(true, new BeginSearchIndex(2), new FindKeysKeynum(0, 1, 1)));

  // synthetic
  Command SENTINEL = create("sentinel");

  /**
   * Generic command generator for extensions.
   *
   * @param command command name
   * @return the cacheable immutable command instance
   */
  static Command create(String command) {
    return new CommandImpl(command, -1, null, false, true);
  }
}
